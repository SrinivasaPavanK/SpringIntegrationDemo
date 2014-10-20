package crm.integration.gateways;

import org.springframework.integration.annotation.Gateway;

import crm.model.Lead;
/**
 * 
 * @author PavanKS
 *
 */
public interface LeadGateway {
	
	@Gateway(requestChannel = "newLeadChannel")
	void createLead(Lead lead);
}
