#Spring Integration:


Using the Spring Framework encourages developers to code using interfaces and use dependency injection (DI) to provide a Plain Old Java Object (POJO) with the dependencies it needs to perform its tasks. 

Spring Integration takes this concept one step further, where POJOs are wired together using a messaging paradigm and individual components may not be aware of other components in the application. 

Spring Integration is a framework for implementing a dynamically configurable service integration tier. 
The point of this tier is to orchestrate independent services into meaningful business solutions in a loosely-coupled fashion, which makes it easy to rearrange things in the face of changing business needs.
The service integration tier sits just above the service tier.

Spring Integration has multiple light weight messaging buses between disparate systems. 
This helps integration of new systems not effecting the
entire architecture and help in easy maintenance as well.

#Advantages:

1. Don't need to spend on SOA stack, no Installations.
2. Heavy ESB solutions can be replaced
3. Provides a simple model for implementing complex enterprise integration solutions.
4. Facilitate asynchronous, message-driven behavior within a Spring-based application
5. Easily testable
6. Ease of Adoption


#Pitfalls:

1. Still new needs more time to mature
2. Adapters such SFTP are not supported
3. Persistent Channel Implementation has certain limitations
