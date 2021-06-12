# 003. Courses management component providing two services

Date: 2021-03-22 10:00
Phase: Sprint 2
Deciders: Camila Parra
Status: accepted

## Motivator

* Business processes are reflecting the core operations and require application support.
* Improve the generation of report of grades at the end of each period.
* Increase maintainability of the system through horizontal scaling

## Decision

Chosen option: "Courses management component providing two services". This component is in charge for accessing the data about courses and grades. This component retrieves the data from the data source and delivered to the business process. Then, a second functionality is to using to receive a set of data and to provide some basic calculations, such as average and summarizations. These two services are not related and can not be provided as once. This component is important because it needs to access relevant information about the file storage and physical storage. It is expected that file storage keep synchronized with the physical storage.

## Alternatives

* Provides a component for each service.