package controller;

import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import model.Agency;
import model.Vehicle;

import java.util.List;

@Singleton
public class AgencyController {
	
	@PersistenceContext(unitName="myPU")
    private EntityManager entityManager;

	/**
	 * Createsthe agency based on modelAgency
	 *
	 * @param modelAgency The model of the agency you want to create
	 * @return agency the concrete agency obtained
	 */
	public Agency createAgency (Agency modelAgency) {
		Agency newAgency = new Agency (modelAgency);
		entityManager.persist(newAgency);
		entityManager.flush();
		return newAgency;
	}

	/**
	 * Update the agency matching the modelAgency
	 *
	 * @param modelAgency The model of the agency you wont to update
	 * @return agency the concrete agency obtained
	 */
	public Agency updateAgency (Agency modelAgency) {
		Agency agency = entityManager.find(Agency.class, modelAgency.getId());
		agency.setAddress(modelAgency.getAddress());
		agency.setBankLink(modelAgency.getBankLink());
		agency.setBankName(modelAgency.getBankName());
		agency.setCity(modelAgency.getCity());
		agency.setIdMotherAgency(modelAgency.getIdMotherAgency());
		agency.setPhoneNum(modelAgency.getPhoneNum());
		agency.setName(modelAgency.getName());
		agency.setRib(modelAgency.getRib());
		agency.setType(modelAgency.getType());
		entityManager.merge(agency);
		entityManager.flush();
		return agency;
	}

	/**
	 * Disable the agency matching idAgency
	 * IMPORTANT ! DO NOT DELETE THE ENTITY FOR LEGAL REASONS
	 *
	 * @param idAgency the id of the agency to manipulate
	 * @return message
	 */
	public String deleteAgency (Integer idAgency) {
		Agency agencyRet = entityManager.find(Agency.class, idAgency);
		agencyRet.setStatus(false);
		entityManager.merge(agencyRet);
		entityManager.flush();
		return ("Agency successfully deleted");
	}

	/**
	 * Enable the agency matching idAgency
	 *
	 * @param idAgency the id of the agency to manipulate
	 * @return message
	 */
	public String activateAgency (Integer idAgency) {
		Agency agencyRet = entityManager.find(Agency.class, idAgency);
		agencyRet.setStatus(true);
		entityManager.merge(agencyRet);
		entityManager.flush();
		return ("Agency successfully activated");
	}

	/**
	 * Returns the agency matching the id provided
	 *
	 * @param idAgency the id of the agency to manipulate
	 * @return the agency matching
	 */
	public Agency getAgency (Integer idAgency) {
		return (entityManager.find(Agency.class, idAgency));
	}

	/**
	 * Returns the list of vehicles of the agency matching idAgency
	 *
	 * @param idAgency the id of the agency
	 * @return the list of agency's vehicles
	 */
	public List<Vehicle> getAgencyVehicles (Integer idAgency) {
		Query q = entityManager.createQuery("SELECT * FROM Vehicule WHERE idAgency="+idAgency);
		return ((List<Vehicle>)q.getResultList());
	}

	/**
	 * UNKNOWN
	 *
	 * @param idAgency the id of the agency
	 * @return UNKNOWN
	 */
	public List<Vehicle> getChildAgencies (Integer idAgency) {
		// Code douteux de la part de charles, à tester...
		Query q = entityManager.createQuery("FROM Agency WHERE id_mother_agency="+idAgency);
		return ((List<Vehicle>)q.getResultList());
	}

}
