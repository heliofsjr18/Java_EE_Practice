/*
 * Developed By hélio
 */

package IPTU;

import java.util.ArrayList;

public class Iptu {

	// Begin Rest Value
	Double restFirstBand;
	Double restSecondBand;
	Double restThirdBand;
	Double restForthBand;
	// End Rest Value

	// Begin Iptu Value
	Double iptuValueFirstBand;
	Double iptuValueSecondBand;
	Double iptuValueThirdBand;
	Double iptuValueForthBand;
	// End Iptu Value

	public ArrayList<Double> calculateIptu(String residenceType, Double calculationBase, Double discount) 
	{
		//Begin Declaring Local Array Variables 
		ArrayList<Double> initialValue = new ArrayList<Double>();
		ArrayList<Double> finalValue = new ArrayList<Double>();
		ArrayList<Double> iptuResult = new ArrayList<Double>();
		ArrayList<Double> rate = new ArrayList<Double>();
		//End Declaring Local Array Variables
		
		
		//Begin Check Type to create procedures to fills value into an Array
		if (residenceType.equalsIgnoreCase("Territorial")) {
			
			// Initial Value
			initialValue.add(0.00);
			initialValue.add(47724.01);
			initialValue.add(357939.01);
			initialValue.add(715879.01);
			// End Initial Value

			// Final Value
			finalValue.add(47724.01);
			finalValue.add(357939.01);
			finalValue.add(715879.01);
			finalValue.add(1193131.01);
			// End Final Value

			// Rate
			rate.add(1.00);
			rate.add(1.60);
			rate.add(2.00);
			rate.add(2.50);
			// End Rate

			// Begin Calculate
			if (calculationBase <= finalValue.get(0)) {

				restFirstBand = calculationBase - finalValue.get(0);
				iptuValueFirstBand = restFirstBand * rate.get(0);
				iptuResult.add(iptuValueFirstBand);

				if (restFirstBand < finalValue.get(1)) {
					restSecondBand = restFirstBand - finalValue.get(1);
					iptuValueSecondBand = restSecondBand * rate.get(1);
					iptuResult.add(iptuValueSecondBand);
				}
				if (restFirstBand < finalValue.get(2)) {
					restThirdBand = restSecondBand - finalValue.get(2);
					iptuValueThirdBand = restThirdBand * rate.get(2);
					iptuResult.add(iptuValueThirdBand);
				}
				if (restFirstBand < finalValue.get(3)) {
					restForthBand = restThirdBand - finalValue.get(3);
					iptuValueForthBand = restForthBand * rate.get(3);
					iptuResult.add(iptuValueForthBand);
				}

			}
			// End Calculate

		//Still Checking Type to create procedures to fills value into an Array
		} else if (residenceType.equalsIgnoreCase("Residencial")) {
			// Initial Value
			initialValue.add(0.00);
			initialValue.add(95450.01);
			initialValue.add(238626.01);
			initialValue.add(417596.01);
			initialValue.add(715879.01);
			initialValue.add(954505.01);
			// End Initial Value

			// Final Value
			finalValue.add(95450.01);
			finalValue.add(238626.01);
			finalValue.add(417596.01);
			finalValue.add(715879.01);
			finalValue.add(954505.01);
			finalValue.add(1193131.01);
			// End Final Value

			// Rate
			rate.add(0.60);
			rate.add(0.70);
			rate.add(0.75);
			rate.add(0.80);
			rate.add(0.85);
			rate.add(0.90);
			// End Rate

			// Begin Calculate
			if (calculationBase <= finalValue.get(0)) {

				restFirstBand = calculationBase - finalValue.get(0);
				iptuValueFirstBand = restFirstBand * rate.get(0);
				iptuResult.add(iptuValueFirstBand);

				if (restFirstBand < finalValue.get(1)) {
					restSecondBand = restFirstBand - finalValue.get(1);
					iptuValueSecondBand = restSecondBand * rate.get(1);
					iptuResult.add(iptuValueSecondBand);
				}
				if (restFirstBand < finalValue.get(2)) {
					restThirdBand = restSecondBand - finalValue.get(2);
					iptuValueThirdBand = restThirdBand * rate.get(2);
					iptuResult.add(iptuValueThirdBand);
				}
				if (restFirstBand < finalValue.get(3)) {
					restForthBand = restThirdBand - finalValue.get(3);
					iptuValueForthBand = restForthBand * rate.get(3);
					iptuResult.add(iptuValueForthBand);
				}
			}
			// End Calculate

		//Still Checking Type to create procedures to fills value into an Array
		} else if (residenceType.equalsIgnoreCase("Não-Residencial")) {
			// Initial Value
			initialValue.add(0.00);
			initialValue.add(35793.01);
			initialValue.add(119313.01);
			initialValue.add(596565.01);
			// End Initial Value

			// Final Value
			finalValue.add(35793.01);
			finalValue.add(119313.01);
			finalValue.add(596565.01);
			finalValue.add(1193131.01);
			// End Final Value

			// Rate
			rate.add(1.20);
			rate.add(1.30);
			rate.add(1.40);
			rate.add(1.50);
			// End Rate

			// Begin Calculate
			if (calculationBase <= finalValue.get(0)) {

				restFirstBand = calculationBase - finalValue.get(0);
				iptuValueFirstBand = restFirstBand * rate.get(0);
				iptuResult.add(iptuValueFirstBand);

				if (restFirstBand < finalValue.get(1)) {
					restSecondBand = restFirstBand - finalValue.get(1);
					iptuValueSecondBand = restSecondBand * rate.get(1);
					iptuResult.add(iptuValueSecondBand);
				}
				if (restFirstBand < finalValue.get(2)) {
					restThirdBand = restSecondBand - finalValue.get(2);
					iptuValueThirdBand = restThirdBand * rate.get(2);
					iptuResult.add(iptuValueThirdBand);
				}
				if (restFirstBand < finalValue.get(3)) {
					restForthBand = restThirdBand - finalValue.get(3);
					iptuValueForthBand = restForthBand * rate.get(3);
					iptuResult.add(iptuValueForthBand);
				}

			}
			// End Calculate
		}
		//End Check Type to create procedures to fills value into an Array

		
		
		//Returning Results...
		return iptuResult;
	}
}