<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<c:url var="actionUrl" value="save"   />

<form:form id="customerForm" name="customerForm" commandName="customer" method="post" action="${actionUrl}" onSubmit="return formvalidate();">
	

	<fieldset>
		<legend></legend>

		<div >
			<label for="code">Code</label>
			<form:input name="customerCode" id = "customerCode" path="customerCode" placeholder="Code" maxlength="15"  />
		</div>
		<div>
			<label for="name">Name</label>
			<form:input name = "customerName" path="customerName" placeholder="Customer Name" id="customerName" />
		</div>
		<div>
			<label for="phoneNo">Phone Number</label>
			<form:input path="phoneNo" placeholder="Phone Number" maxlength="10" minlength="10" id="phoneNo" name="phoneNo" />
				
		</div>
		
		<div>
             <label>Select list</label>
             <form:select path="department" id="department">
            
                <form:option value="Promotions" label="Promotions" />
                <form:option value="Administration" label="Administration" />
                <form:option value="Administration" label="Administration" />
                <form:option value="Sales" label="Sales" />
                <form:option value="Transport" label="Transport" />
             </form:select>
             
             
       
		</div>

		<form:input path="customerId" type="hidden" />

	</fieldset>
</form:form>

<script type="text/javascript">
function formvalidate(){
	var valid = true;
	  var msg="Incomplete form:\n";
	  if ( document.getElementById(customerCode) == "" ) {
	 
	      document.customerForm.customerCode.focus();
	   
	    document.customerForm.customerCode.style.border="solid 1px red";
	    msg+="You need to fill the Code field!\n";
	    valid = false;
	  }
	  if ( document.customerForm.customerName.value == "" ) {
	   
	      document.customerForm.customerName.focus();
	    document.customerForm.customerName.style.border="solid 1px red";
	    msg+="You need to fill in your Name!\n";
	    valid = false;
	  }
	  if( document.customerForm.phoneNo.value == ""){
		  document.customerForm.phoneNo.focus();
		    document.customerForm.phoneNo.style.border="solid 1px red";
		    msg+="You need to fill in your Phone No!\n";
		    valid = false;  
	  }
	  if (!valid) alert(msg);
	  return valid;
	}


</script>