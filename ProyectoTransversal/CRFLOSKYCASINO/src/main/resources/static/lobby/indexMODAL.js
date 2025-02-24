function cerrarModal(id) {
    document.getElementById(id).style.display = "none";
}

function openModal(modalId) {
    document.getElementById(modalId).style.display = "flex";
}

function closeModal(modalId) {
    document.getElementById(modalId).style.display = "none";
}

// Función para mostrar el modal
function mostrarModal(modalId) {
    var modal = document.getElementById(modalId);
    modal.classList.add('show');
}

// Función para ocultar el modal
function ocultarModal(modalId) {
    var modal = document.getElementById(modalId);
    modal.classList.remove('show');
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

function showExitoModal(mensaje) {
    let exitoModal = document.getElementById("exitoModal");
    let exitoText = document.getElementById("exito");

    exitoText.innerText = mensaje; // Cambia el texto del modal con el mensaje recibido
    exitoModal.style.display = "flex"; // Muestra el modal

    // Cierra el modal después de 3 segundos
    setTimeout(() => {
        exitoModal.style.display = "none";
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
    
    var username = $("#username").val();
    var pwd = $("#pwd").val();
    var email = $("#email").val();
    var nombre = $("#nombre").val();
    var apellido = $("#apellido").val();
    var dni = $("#dni").val();
    var fechaNacimiento = $("#fechaNacimiento").val();
    //CREACIÓN JSON CON DATOS DEL REGISTRO
    var registroData={
        username:username,
        pwd:pwd,
        email:email,
        nombre:nombre,
        apellido:apellido,
        dni:dni,
        fechaNacimiento:fechaNacimiento,
    }
    console.log(JSON.stringify(registroData));	
    $.ajax({
        type: "POST",
        url: "/usuario/registro",
        contentType: "application/json",
        data: JSON.stringify(registroData),
        success: function(response) {
            showExitoModal("USUARIO REGISTRADO CON ÉXITO.");
            closeModal("registerModal");
            console.log("Respuesta del servidor:", response);
        },
        error: function(error) {
            console.error("Error en la solicitud AJAX:", error);
        }
    });
})

function submitGet() {
     var username = $("#usernameLogin").val();
     var pwd = $("#pwdLogin").val();
     console.log(username+"y"+pwd)
    $.ajax({
        type: "GET",
        url: `/usuario/${username}/${pwd}`, //URL CONFIGURADA PARA QUE DIRIJA AL CONTROLADOR
        
        success: function(response) {
            //POSIBLES SALIDAS DE RESPONSE 
            if(response == "OK"){
                console.log("Respuesta del servidor (GET):", "Redirigiendo al lobby");
                showExitoModal("Usuario encontrado.");
                window.location.href = "lobbyCasino.html";
            }else if(response == "404"){
                showErrorModal("Usuario no encontrado.");
                console.log("Usuario no encontrado")
            }else if(response == "PWDNF"){
                showErrorModal("Contraseña incorrecta.");
                console.log("Contraseña incorrecta.");
            }
            
        },
        error: function(error) {
            console.error("Error en la solicitud AJAX (GET):", error);
        }
    });
}