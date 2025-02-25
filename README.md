# Proyecto-Transversal
Proyecto transversal realizado por Miguel Ángel Cuadrado Robles y Sergio Bravo Mora


## Características
- Registro y autenticación de usuarios.
- Visualización de juegos disponibles.
- Realización de apuestas.
- Consulta de saldo y transacciones.
- Gestión de usuarios y administración.

## Tecnologías Utilizadas
- **Spring Boot**: Framework principal para el desarrollo de la aplicación.
- **MySQL**: Base de datos utilizada para almacenar la información.
- **Thymeleaf**: Motor de plantillas para la creación de la interfaz de usuario.
- **Railway**: Plataforma de despliegue para la aplicación.

## Requisitos
- JDK 17.
- Maven.
- MySQL Server.
- Visual Studio Code

1. Clonación el repositorio:

   # https://github.com/sergiobmnv/Proyecto-Transversal.git

2. Diseño de bocetos en Figma:

	# https://www.figma.com/design/7AWQ04YHXDH6ZGVIlfP749/CR_FLOSKY_CASINO?node-id=0-1&m=dev&t=RT7cn8BMMCARizEv-1


3. Despligue en Railway.

	# [casinocrflosky.up.railway.app](https://casinocrflosky.up.railway.app/)


# Instrucciones paso a paso de como desplegar tu proyecto en Railway.
		
		Paso 1: Registrarte en Railway mediante Git Hub.
		Paso 2: Crearemos un proyecto vacio en RailWay (Empty project).
		Paso 3: Abrir nuestro proyecto en VS Code.
		Paso 4: Ubicarnos en el application.propierties(No es necesario hacer cambios).
		Paso 5: Agregar un servidor en RailWay (Add a Service) y agregamos MySQL para agregar la estancia.
		Paso 6: Entrar en las Variables de MySQL en RailWay:	
		Paso 7: Rellenar los siguientes campos sacandolo de las variables de RailWay:
					DB_HOST=
					DB_PORT=
					DB_NAME=
					DB_USER=
					DB_PASSWORD=
		Paso 8: En la interfaz de Railway darle click derecho fuera del servidor y darle a la ultima opcion(Empty Service)
				para crear un servicio vacio, entramos en los ajustes, y conectaremos un repositorio de git hub para desplegarlo.
		Paso 9: Conectar ese servicio vacio con el repositorio del proyecto.

# Descripción del Funcionamiento del Casino
    El casino cuenta con una interfaz de usuario intuitiva y amigable, diseñada para ofrecer una experiencia de juego atractiva. A continuación, se describen las principales características y funcionalidades de la aplicación:

# Menú Lobby
    Al acceder a la aplicación, los usuarios son recibidos en el Lobby, donde se presentan todos los juegos disponibles. En esta sección, los jugadores pueden ver una lista de los diferentes juegos ofrecidos por el casino. El menú incluye botones para Iniciar sesión y Registro, lo que permite a los nuevos usuarios crear una cuenta y a los usuarios existentes acceder a su perfil.

# Cambios tras el Inicio de Sesión
    Una vez que un usuario inicia sesión, el menú se actualiza para reflejar su estado. En lugar de los botones de inicio de sesión y registro, se muestra un icono de usuario. Este icono permite al jugador acceder a su perfil y ver opciones adicionales, como:
    
       · Meter Saldo: Permite a los usuarios añadir fondos a su cuenta para realizar apuestas.

       · Hazte VIP: Opción para que los usuarios se conviertan en miembros VIP, lo que puede ofrecer beneficios adicionales y    promociones exclusivas.
       
       · El menú sigue manteniendo el acceso a los juegos disponibles, proporcionando una experiencia continua y fácil de navegar.

# Juegos Disponibles
    - El casino ofrece varios juegos distintos, cada uno con su propio estilo y mecánica:

    Slots: Un clásico juego de tragamonedas donde los usuarios pueden girar los carretes y tratar de obtener combinaciones ganadoras.

    Juego del Dino: Un emocionante juego donde los jugadores deben tomar decisiones rápidas para avanzar, desafiando su agilidad y suerte.

    Busca Minas: Un juego de estrategia donde los usuarios deben descubrir casillas en un campo minado, evitando las minas y buscando tesoros ocultos.

    Cada uno de estos juegos está diseñado para ofrecer una experiencia única y entretenida, garantizando que haya algo para todos los gustos.