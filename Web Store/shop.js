// This js file defines the prices of each service and allows the 
// customer to order their selected service(s).

// Declare the cost variables for each type of service
var oil_cost = 35;
var tire_cost = 25;
var wash_cost = 20;
var wax_cost = 15;
var total = 0;

// This function runs whenever a checkbox item is checked or unchecked
function updatePrice(form) {
	// Determine which service the customer wants
	// Then add the cost to the total due
	
	// Reset the total every time this function is run
	total = 0;
	
	// In this instance, not using 'else if' statements since we want to run through each item
	// individually every time the function is called.
	if (form.oil_change.checked == true) {
		total = total + oil_cost;
	} 
	if (form.tire_rotation.checked == true) {
		total = total + tire_cost;
	} 
	if (form.car_wash.checked == true) {
		total = total + wash_cost;
	} 
	if (form.car_wax.checked == true) {
		total = total + wax_cost;
	} 
    // Update the order total in index.html
	const div_total = document.getElementById("total");
	div_total.innerHTML = `$` + total;
	
}

// Function that runs when the Submit button is pressed
function submitForm(form) {
		// This code determines if the user has completed the First Name, Last Name, and Phone Number sections.
		// First, return the values from each textbox
		const fname_required = document.getElementById("fname").value;
		const lname_required = document.getElementById("lname").value;
		const phone_required = document.getElementById("phone").value;
		// Query the textbox items to that will be styled if they miss an entry
		const fname_style = document.getElementById("fname");
		const lname_style = document.getElementById("lname");
		const phone_style = document.getElementById("phone");
		// If any of the textboxes are empty, notify the user
		if (fname_required == "") {
			// Change the background color of each to red
			fname_style.style.backgroundColor = "#FFCCCC";
			// Return out of function
			return	
		} else if (lname_required == "") {
			// Change the background color of each to red
			lname_style.style.backgroundColor = "#FFCCCC";
			// Return out of function
			return
		} else if (phone_required == ""){
			// Change the background color of each to red
			phone_style.style.backgroundColor = "#FFCCCC";
			// Return out of function
			return
			// Else, submit the form		
		} else {
			// Loop to disable the form after the request has been submitted
			var inputs = document.getElementsByTagName("input"); 
			for (var i = 0; i < inputs.length; i++) { 
				inputs[i].disabled = true;
			} 
	
			// Update the contents of the receipt div
			var br = document.createElement("br");
			const div_receipt = document.getElementById('receipt');
			const getfName = document.getElementById("fname").value;
			const message = document.createTextNode("Thank you for your order, " + getfName + ".")
			const printTotal = document.createTextNode("Your total is $" + total);
			div_receipt.appendChild(br);
			div_receipt.appendChild(message);
			div_receipt.appendChild(br);
			div_receipt.appendChild(printTotal);
			// Make the textboxes go back to white after submitting
			fname_style.style.backgroundColor = "white";
			lname_style.style.backgroundColor = "white";
			phone_style.style.backgroundColor = "white";
		}
	
}

// Reset button for the checkboxes on the form
function resetForm(form) {
	// Set each checkbox to false, therefore marking them unchecked
	form.oil_change.checked = false;
	form.tire_rotation.checked = false;
	form.car_wash.checked = false;
	form.car_wax.checked = false;
	
	// Reset the total
	total = 0;
	
	// Update the order total on the form
	const div_total = document.getElementById("total");
	div_total.innerHTML = `$` + total;
}

// Allow customer to select all of the options with a button
function selectAll(form) {
	form.oil_change.checked = true
	form.tire_rotation.checked = true
	form.car_wash.checked = true
	form.car_wax.checked = true

}