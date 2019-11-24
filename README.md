# PresupuestoFranciscoAMP
Creación de proyecto PresupuestoFranciscoAMP en el que se crea un presupuesto de seguros del hogar.

## Introducción.
Creación de proyecto PresupuestoFranciscoAMP en el que se crea un presupuesto de seguros del hogar, teniendo en cuenta los siguientes
aspectos:
1. Los seguros pueden ser de dos tipos y se puede hacer sobre cualquiera
de ellos o de los dos a la vez.
2. Existe seguro de continente (la casa en si) o de contenido (lo que
contiene la casa).

Nombre de la agencia de Seguros Gestoria de Seguros NORMAS.

Se estrutura de la siguiente manera:

Se alade dependiencia:
~~~~
<!-- https://mvnrepository.com/artifact/javax.servlet/jstl -->
<dependency>
    <groupId>javax.servlet</groupId>
    <artifactId>jstl</artifactId>
    <version>1.2</version>
</dependency>
~~~~
Dentro de Web Pages añadimos archivo index.jsp.

Creamos los directorios:
- CSS -> En este archivo es donde van los estilos de todas las páginas del proyecto. Además se añade la fuente que se vá a utilizar. SanFrancisco.ttf
- INC -> Se crea el archivo archivos de cabecera y pie de página cabecera.inc y piePagina.inc
- JSP -> Se crean los archivos contenido.jsp, edificio.jsp y verCuota.jsp 

En Source Packages,los paquetes:

- es.albarregas.beans, dentro se crean las clases Contenidos.java, Edificios.java y Elecciones.java.
- es.albarregas.controllers, donde se crearán los controladores de la aplicación, es decir, los Servlets contenido.java, edificio.java y eleccion.java
- es.albarregas.models, donde se calcula la cuota. En la clase CalcularCuota.java

24/11/19 by Francisco Antonio Murillo Pacheco



