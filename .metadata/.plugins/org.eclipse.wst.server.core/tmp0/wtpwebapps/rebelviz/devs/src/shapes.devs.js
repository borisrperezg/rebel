var graph = new joint.dia.Graph;

var paper = new joint.dia.Paper({

    el: document.getElementById('paper'),
    width: 800,
    height: 400,
    gridSize: 1,
    model: graph,
    snapLinks: true,
    linkPinning: false,
    embeddingMode: true,
    clickThreshold: 5,
    defaultConnectionPoint: { name: 'boundary' },
    highlighting: {
        'default': {
            name: 'stroke',
            options: {
                padding: 6
            }
        },
        'embedding': {
            name: 'addClass',
            options: {
                className: 'highlighted-parent'
            }
        }
    },

    validateEmbedding: function(childView, parentView) {
        return parentView.model instanceof joint.shapes.devs.Coupled;
    },

    validateConnection: function(sourceView, sourceMagnet, targetView, targetMagnet) {
        return sourceMagnet != targetMagnet;
    }
});

var connect = function(source, sourcePort, target, targetPort) {

    var link = new joint.shapes.devs.Link({
        source: {
            id: source.id,
            port: sourcePort
        },
        target: {
            id: target.id,
            port: targetPort
        }
    });

    link.addTo(graph).reparent();
};


var a1 = new joint.shapes.devs.Atomic({
    position: {
        x: 360,
        y: 260
    },
    inPorts: ['xy'],
    outPorts: ['x', 'y']
});

var a2 = new joint.shapes.devs.Atomic({
    position: {
        x: 50,
        y: 160
    },
    outPorts: ['out']
});

var a3 = new joint.shapes.devs.Atomic({
    position: {
        x: 650,
        y: 50
    },
    size: {
        width: 100,
        height: 300
    },
    inPorts: ['a', 'b']
});

[a1, a2, a3].forEach(function(element) {
    element.attr({
        '.body': {
            'rx': 2,
            'ry': 2
        }
    });
});

graph.addCells([a1, a2, a3]);

connect(a2, 'out', a1, 'xy');
connect(a1, 'x', a3, 'a');
connect(a1, 'y', a3, 'b');

// Interactions

var strokeDasharrayPath = '.body/strokeDasharray';

paper.on('element:pointerdblclick', function(elementView) {
    var element = elementView.model;
    if (element.get('type') === 'devs.Atomic') {
        toggleDelegation(element);
    }
});

paper.setInteractivity(function(elementView) {
    return {
        stopDelegation: !elementView.model.attr(strokeDasharrayPath)
    };
});

toggleDelegation(a1);

function toggleDelegation(element) {
    element.attr(strokeDasharrayPath, element.attr(strokeDasharrayPath) ? '' : '15,1');
}

console.log(JSON.stringify(graph.toJSON()));
