(function($) {
	$.Class
			.extend(
					"Defysope.module.register.MainClass",
					{
						init : function(el, data) {
							this.el = $(el);
							$(".BtnRegister").click(
									this.callback("firstMethod"));
							$("#dob").datepicker({
								"dateFormat" : "dd M yy"
							});

							this.validator = $("#registerFrm")
									.validate(
											{
												rules : {
													name : "required",
													userName : {
														required : true,
														minlength : 4
													},
													password : {
														required : true,
														minlength : 5
													},
													password_confirm : {
														required : true,
														minlength : 5,
														equalTo : "#password"
													},
													email : {
														required : true,
														email : true
													},
													dob : {
														required : true,
														date : true
													}
												},
												messages : {
													name : "Please enter your name",
													username : {
														required : "Please nter a username",
														minlength : jQuery
																.format("Enter at least {0} characters")
													},
													password : {
														required : "Please enter the password",
														rangelength : jQuery
																.format("Enter at least {0} characters")
													},
													password_confirm : {
														required : "Please enter confirm password",
														minlength : jQuery
																.format("Enter at least {0} characters"),
														equalTo : "Enter the same password as above"
													},
													email : {
														required : "Please enter a valid email address",
														minlength : "Please enter a valid email address"
													},
													dob : {
														required : "Please enter the date of birth",
														date : "Please enter the proper date(dd MMM yyyy)"
													}
												},

												errorPlacement : function(
														error, element) {
													if (element.is(":radio"))
														error.appendTo(element
																.parent()
																.next().next());
													else if (element
															.is(":checkbox"))
														error.appendTo(element
																.next());
													else

														error.appendTo(element
																.parent()
																.next());
												},
												// specifying a submitHandler
												// prevents the default submit,
												// good for the demo
												submitHandler : function() {
													if (validator.valid()) {
														alert("success")
													}
												},
												// set this class to
												// error-labels to indicate
												// valid fields
												success : function(label) {
													// set &nbsp; as text for IE

													label
															.html("&nbsp;")
															.addClass("checked");
												}
											});
						},
						firstMethod : function() {
							if (this.validator.valid()) {

							}
						}

					})
})(jQuery);