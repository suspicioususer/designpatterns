package creational.factorymethod;

import creational.factorymethod.plans.CommercialPlan;
import creational.factorymethod.plans.DomesticPlan;
import creational.factorymethod.plans.InstitutionalPlan;
import creational.factorymethod.plans.Plan;

class GetPlanFactory {

	public Plan getPlan(String planType) {

		if (planType == null) {
			return null;
		}

		if (planType.equalsIgnoreCase("DOMESTICPLAN")) {
			return new DomesticPlan();
		} else if (planType.equalsIgnoreCase("COMMERCIALPLAN")) {
			return new CommercialPlan();
		} else if (planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {
			return new InstitutionalPlan();
		}
		return null;
	}
}