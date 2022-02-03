function invalidEmail() {
    alert("Email is invalid");
}
function showSignUp(b) {
    let formContainer = document.getElementById("form-container");
    formContainer.style.display = "block";
    b.style.display = "none";
    document.getElementById("logInbtn").style.display = "none";
    document.getElementById("form-container2").style.display = "none";

}
function logInForm(b) {
    let formContainer = document.getElementById("form-container2");
    formContainer.style.display = "block";
    b.style.display = "none";
    document.getElementById("signInbtn").style.display = "none";
    document.getElementById("form-container").style.display = "none";
}
function hideLogin() {
    document.getElementById("form-container").style.display = "none";
    document.getElementById("form-container2").style.display = "none";
    document.getElementById("logInbtn").style.display = "block";
    document.getElementById("signInbtn").style.display = "block";
}