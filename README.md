SpringIntegrationDemo
=====================

Spring Integration Demo Project


#Project: Lead management

Spring Integration to integrate several of systems of the kind just mentioned into an overall lead management capability for a hypothetical online university. 

 1. a CRM system that allows campus and call center staff to create leads directly, as they might do for walk-in or phone-in leads
 2. a Request For Information (RFI) form on a lead generation ("lead gen") marketing website
 
#Build Instructions:

1.Run the command against  mvn jetty:run against crm/pom.xml
2.point your browser at
  http://localhost:8080/crm/main/lead/form.html
3.Enter some user information and press Submit. The console should report that LeadServiceImpl.createLead() created a lead. Congratulations!

 
