function openModal(modalId) {
    document.getElementById(modalId).style.display = "flex";
}

function closeModal(modalId) {
    document.getElementById(modalId).style.display = "none";
}

function showErrorModal(mensaje) {
    let errorModal = document.getElementById("errorModal");
    let errorText = document.getElementById("error");

    errorText.innerText = mensaje; // Cambia el texto del modal con el mensaje recibido
    errorModal.style.display = "flex"; // Muestra el modal

    // Cierra el modal después de 3 segundos
    setTimeout(() => {
        errorModal.style.display = "none";
    }, 3000);
}

const btnRegistro = document.getElementById("registro")
document.getElementById("registroForm").addEventListener('submit',function(event){
    event.preventDefault();
    var edad=false,password=false,dni=false;  
    var password1 = document.getElementById("pwd").value;
    var password2 = document.getElementById("pwd2").value;
        //COMPROBACIÓN PASSWORDS COINCIDEN, CONTIENEN MAYÚSCULA Y SU LONGITUD ES MAYOR A 10.
                if(password1===password2 && password1.length >10){                   
                    if(!/[A-Z]/.test(password1)){
                        showErrorModal("La contraseña debe tener mínimo una mayúscula.");
                    }else{
                        password=true;
                    }
                }else if(password1.length <10){
                    showErrorModal("La longitud de la contraseña debe ser mayor a 10.");
                }else{
                    showErrorModal("Las contraseñas no coinciden.");
                }
    var fechaNacimiento = document.getElementById("fechaNacimiento").value;
    var edad = new Date(fechaNacimiento).getFullYear();
    var hoy = new Date().getFullYear(); 
        //COMPROBACIÓN EL USUARIO ES MAYOR DE 18 
                if((hoy-edad)>=18){
                    edad=true;
                }else{
                    showErrorModal("Queda prohibido el acceso a menores.");
                }
    const dniRegex = /^[0-9]{8}[A-Za-z]$/;
        //COMPROBACIÓN DNI TIENE UN FORMATO CORRECTO
                if (dniRegex.test(document.getElementById("dni").value)) {
                    dni=true;
                } else {
                    showErrorModal("El formato del DNI es incorrecto.");
                }
    //CREACIÓN JSON CON DATOS DEL REGISTRO
    var registroData={
        username:username,
        email:email,
        pwd:pwd,
        nombre:nombre,
        apellido:apellido,
        fechaNacimiento:fechaNacimiento,
    }
    console.log(JSON.stringify(registroData));	
    $.ajax({
        type: "POST",
        url: "/usuario/registro",
        contentType: "application/json",
        data: JSON.stringify(registroData),
        success: function(response) {
            console.log("Respuesta del servidor:", response);
        },
        error: function(error) {
            console.error("Error en la solicitud AJAX:", error);
        }
    });
})