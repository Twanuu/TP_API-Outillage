# https://github.com/Twanuu/TP_API-Outillage.git
# Antoine Riaublanc groupe TP INFO3


# TP_API-Outillage
Réalisation d'une application Web avec Spring Boot

# Spring Web WEB
Build web, including RESTful, applications using Spring MVC. Uses Apache Tomcat as the default embedded container.

# Spring Data JPA SQL
Persist data in SQL stores with Java Persistence API using Spring Data and Hibernate.

# H2 Database SQL
Provides a fast in-memory database that supports JDBC API and R2DBC access, with a small (2mb) footprint. Supports embedded and server modes as well as a browser based console application.

# Spring Boot DevTools DEVELOPER TOOLS
Provides fast application restarts, LiveReload, and configurations for enhanced development experience.

# Thymeleaf TEMPLATE ENGINES
A modern server-side Java template engine for both web and standalone environments. Allows HTML to be correctly displayed in browsers and as static prototypes.

# Etape 13
1. Dans le code du controlleur, l'URL d'appel /greeting est paramétrée grâce à l'annotation @GetMapping("/greeting"). Cela signifie que lorsque l'application reçoit une requête GET à l'URL /greeting, la méthode greeting du contrôleur sera appelée.
2. Le fichier HTML à afficher est choisi par la ligne return "greeting"; dans la méthode greeting. Lorsque la méthode retourne "greeting", Spring Boot sait qu'il doit chercher un fichier HTML nommé "greeting.html" dans le dossier des templates Thymeleaf.
3. Le nom à qui nous disons bonjour est envoyé avec le paramètre name dans l'URL. Dans l'annotation @RequestParam(name = "name", required = false, defaultValue = "World"), le paramètre name est extrait de l'URL. Si le paramètre n'est pas présent dans l'URL, le defaultValue "World" est utilisé. Ainsi, le nom peut être spécifié dans l'URL comme "/greeting?name=John" et sera récupéré par la méthode greeting.

# Etape 17
On remarque l'apparition d'une table ADDRESS contenant nos arguments.
Il y a égamlement une HIBERNATE_SEQUENCE

# Etape 18

# Etape 20
Oui je vois le contenu de data.sql
SELECT * FROM ADDRESS;
ID  	CONTENT  	CREATION  	NAME   
1	57 boulevard demorieux	2023-12-10 09:52:15.085478	Bim  
2	51 allee du gamay, 34080 montpellier	2023-12-10 09:52:15.087925	Bam  
(2 rows, 13 ms)

# Etape 22
L'annotation @Autowired est utilisée pour indiquer à Spring de rechercher et d'injecter une instance appropriée du type spécifié (dans ce cas, AddressRepository). Cela fait partie du mécanisme d'injection de dépendances de Spring.  
Dans le code, on utilise l'annotation @Autowired pour injecter une instance de la classe AddressRepository dans le contrôleur AddressController. Ainsi, Spring prend en charge la création automatique de l'instance AddressRepository et son injection dans la propriété addressRepository du contrôleur. Cela simplifie la gestion des dépendances et permet une intégration transparente entre les différentes parties de l'application.

# Etape 30
J'ai inséré cette balise link dans le head de mes pages html  
link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"  
          rel="stylesheet"  
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"  
          crossorigin="anonymous"  

# TP4
1. Oui, une clé API est nécessaire pour appeler MeteoConcept.
2. L'URL à appeler est "https://api.meteo-concept.com/api".
3. Il faut utiliser la méthode HTTP GET pour effectuer la demande.
4. Les paramètres peuvent être passés dans l'URL en utilisant la syntaxe habituelle des paramètres de requête. Pour les coordonnées GPS, utilisez le paramètre "latlng", et pour le code INSEE de la commune, utilisez le paramètre "insee".  
5. Pour afficher la température du lieu visé par les coordonnées GPS :  
L'information de température peut être extraite de l'objet forecast dans la réponse. Par exemple, si forecast est une instance de MeteoDailyForecast, vous pouvez accéder à la température via forecast.getTmin() et forecast.getTmax().
6. Pour afficher la prévision de météo du lieu visé par les coordonnées GPS :  
Les détails de la prévision météorologique se trouvent également dans l'objet forecast dans la réponse. Vous pouvez accéder aux différentes informations telles que le vent, la pluie, la neige, etc., en fonction de la structure de la classe MeteoDailyForecast. Par exemple, pour la pluie, vous pouvez utiliser forecast.getRr10().
