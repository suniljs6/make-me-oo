The intention of Shivam was to write a solution for the following two
- Find distance between two points
- Find direction (angle) between two points in Radians.
 

He did try to implement using OOPs but that was not completely OOPs because 'Point' class had only properties and no behaviour, 'DistanceAndDirectionCalculator' class had only behaviors and no property. There was no data binding in either of the classes. 

The properties on the 'Point' class where not final and they were initialised using setters which means that the data on the properties could be changed on the fly, which breaks the contract.

The four main principles:-
- Solution should pass the test.
- Solution should reveal intention.
- There is no duplication in solution.
- Solution proposed should have fewer elements.

The solution proposed by shivam does cover the first three principles but the solution doesn’t have the fewer elements.

Our goal is to make the solution cover all the four principles also without loosing OOPs





