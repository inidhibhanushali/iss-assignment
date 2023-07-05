function validateForm() {
    var name = document.forms["myForm"]["name"].value;
    var email = document.forms["myForm"]["email"].value;
    var password = document.forms["myForm"]["password"].value;
    var age = document.forms["myForm"]["age"].value;

    if (name == "") {
        alert("Name must be filled out");
        return false;
    }
    // checking name 
    if (email == "") {
        alert("Email must be filled out");
        return false;
    }
    // checking email
    if (password == "") {
        alert("Password must be filled out");
        return false;
    }
    // password != null
    if (age == "" || isNaN(age)) {
        alert("Age must be a number");
        return false;
    }
    // age check
}