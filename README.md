# <pre align="center">Enhancement One: Software Design and Engineering</pre>

## <pre align="center">Mechanic Shop Website</pre>

Located in the **Web Store** Folder

For **Enhancement One: Software Design/Engineering**, I have taken a Python program from **CS-200** and converted it into a website. It is meant to be a mechanic shop, 
where customers may place an order for which services they would like. The original project was output in a Python terminal window, which I felt was not a great 
option for prospective customers. I chose this project because I believe it would be a beneficial upgrade to the original project, as a Python terminal application 
is not suitable to any company. Typically, companies will use websites to have customers place orders, not terminal windows. Therefore, I created a basic website design 
using HTML and CSS, while creating a form in HTML that works with JavaScript in the backend. JavaScript allows me to change elements within HTML code while performing 
arithmetic to compile the customer’s receipt.

This artifact allows me to showcase some of my Full Stack abilities, since that can be an important aspect of software development. I’ve been able to thoroughly improve 
this application with much trial and error. I see myself as a decent Python developer, but my website development skills have improved through the development of this 
project. I have been able to create multiple buttons that the user can select that either submit the form, clear the selected services, or select all services. I have 
also included a counter element that tells the customer their order total in real time. I have been able to display skills illustrated in the course outcomes, such as 
[CS-499-04] Demonstrate an ability to use well-founded and innovative techniques, skills, and tools in computing practices for the purpose of implementing computer 
solutions that deliver value and accomplish industry-specific goals (software engineering/design/database). I believe I also have successfully met the outcome of 
[CS-499-03] Design and evaluate computing solutions that solve a given problem using algorithmic principles and computer science practices and standards appropriate to 
its solution, while managing the trade-offs involved in design choices (data structures and algorithms). 

My first submission for this artifact was missing quite a few items. It only had a basic design for the shop form, and had some issues such as the inability to properly
add items to the cart. I was able to implement some responsive elements and an overall theme to fix these issues. To fix the issue with the cart, I changed my chained 
conditional statement to be independant if-statements, where the total reset every time another checkbox was clicked on. This made it so that it updated accoringly every
time the form was edited. I also included some code in the <code>shop.js</code> file that made certain form items required, such as the first name, last name, and phone number text boxes. 
In addition to this, I've implemented new pages into the website, such as a services page, that has images and information about each service. I also created a contact us form

I've also been able to incorporate instructor feedback into this artifact. Primarily, I was required to clean up the HTML, CSS, and JS code, plus add more comments 
so that any developer can hop in and edit the website. Below is an example of commented code within the <code>shop.js</code> file. This particular section of code makes certain elements require some form of input, or the text box will turn red and not submit.

```

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

```

### <pre align="center">Future Updates to this artifact</pre>

In the future, I plan to make some more enhancements to this artifact. Firstly, I'd like to incoporate a responsive calendar application so that prospective customers
may schedule appointments for the services they've requested. Additionally, I'd like to create a PHP backend that submits the form into the website's system.


### <pre align="center">First Design (index.html)</pre>

Note to self: Add image of original design

### <pre align="center">Final Design (index.html)</pre>

Note to self: Add image of new design
