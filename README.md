# Quark_Bye

## Que es Quark_bye?

Tranquilo , solo es una prueba no es muy importante para ti, a no ser que quieras ver el proceso de un mono golpeando el teclado y que hace una API REST con quarkus.

# Pasos realizados

Se han realizado los pasos suponiendo que maven ya esta instalado , si no , el primer paso es instalar maven.

## Crear Hello World

Lanzamos maven con el pluguin de quarkus y su version, para encontrar la version actualizada he buscado el plugin de quarkus y he seleccionado a su pagina oficial [Quarkus](https://quarkus.io/guides/maven-tooling)

```bash
$ mvn io.quarkusplatform:quarkus-maven-plugin:2.7.5.Final:create \
    -DprojectGroupId=edu.poniperro \
    -DprojectArtifactId=my-getting-started \
    # para generar la clase REST
    -DclassName="edu.poniperro.quickstart.GettingResource" \
    # Primera ruta
    -Dpath="/bye"
```

Ahora se generara la aplicacion y para lanzar nuestra aplicacion en modo dev. El modo dev lo que hace es que no hay necesidad de compilar cada vez que hagamos un cambio , hará restart de una forma bastante rapida.

```bash
$ mvn compile quarkus dev
```

La aplicacion estara corriendo en el localhost:8080

Para comprobar que funciona usamos:

```bash
$ curl localhost:8080/bye
```

En el caso que no develva nada deberiamos comprobar que el path se ha creado como esperabamos, se encuentra en `./code-with-quarkus/src/java/edu/poniperro/quickstart/GreetingResource.java`

Estara entre parentesis en un @Path , como es de suponer , ahi defines el path. En el caso de que no ponga "/bye" es por eso que no os funciona.

Si no os gusta la consola o le teneis miedo porque a veces muerde o grita , podemos ir al navegador y ponel en el buscador `localhost:8080/bye`

### El curioso del hello world

Si te fijas en el codigo que hay en el path:

```Java
@Path("/bye")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "bye";
    }
```

En @Produces(MediaType.TEXT_PLAIN) hay TEXT_PLAIN , eso significa que puede producir otro tipo de texto , asi que deciciprobar el primero que salia que era TEXT_HTML y añadir un codigo HTML que quedo de esta manera:

```Java
@Path("/bye")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_HTML)
    public String hello() {
        return "<img src='https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2F2img.net%2Fh%2F24.media.tumblr.com%2Ftumblr_lmjqalqtmX1qah4nko1_500.gif&f=1&nofb=1'%>"
                +
                "<h1>Bienvenido</h1>" +
                "<h2>Informo que va a estar poblado de cosas de One Piece</h2>";
    }
```

Por arte de magia funciona

<img src="./docs/quarkus_hello_wordl_html.PNG">

## Parametros configuracion

Por defecto cuarkus lee la configuracion en el fichero application.properties, que se encuentra en `./code-with-quarkus/src/main/resources/application.properties`

añadimos una linea con para definir un parametro que en mi caso , como quiero que se vea lo de siempre es meter todo el return sin comillas en una sola linea.

```Java
greetings.inicio=<img src='https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2F2img.net%2Fh%2F24.media.tumblr.com%2Ftumblr_lmjqalqtmX1qah4nko1_500.gif&f=1&nofb=1'%>"<h1>Bienvenido</h1><h2>Informo que va a estar poblado de cosas de One Piece</h2>
```

_Ya se que es una porqueria pero me hacia ilu_ 👉👈

---

### Se esta realizando el curso de OpenWebinars por Alex Soto.

De momento es un hello world con pruebas , espero que poco a poco pueda cambiar el README para que sea un mono tecleando algo que entiende.
