README - Systèmes de Communication Distribuée en Java
Ce projet démontre l'implémentation de trois systèmes de communication distribuée utilisant Java RMI, gRPC, et les sockets. Le but est de comparer ces technologies en termes de mise en œuvre, performance, et flexibilité.

Prérequis
Java JDK 11 ou supérieur
Maven pour la gestion des dépendances du projet gRPC
Protobuf Compiler pour gRPC (généralement géré par Maven)
IDE recommandé: IntelliJ IDEA ou Visual Studio Code avec support Java
Structure du Projet
Le dépôt est organisé comme suit :

arduino
Copy code
/
├─ RMI/
│  ├─ Server.java
│  ├─ Client.java
│  └─ ...
├─ gRPC/
│  ├─ build/
│  ├─ src/
│  └─ ...
├─ Sockets/
│  ├─ ChatServer.java
│  ├─ ChatClient.java
│  └─ ...
└─ README.md
Déploiement et Test
Java RMI - Gestion d'une liste de tâches
Compiler et exécuter le serveur RMI

Naviguez dans le répertoire RMI/
Compilez les fichiers: javac *.java
Lancez le RMI registry: rmiregistry &
Démarrez le serveur: java Server
Exécuter le client RMI

Dans un autre terminal, lancez le client: java Client
Suivez les instructions à l'écran pour ajouter, supprimer ou lister les tâches.
gRPC - Service de messagerie
Compiler et lancer le serveur gRPC

Naviguez dans le répertoire gRPC/
Exécutez: mvn clean compile exec:java -Dexec.mainClass="com.example.grpc.Server"
Exécuter le client gRPC

Dans un autre terminal, exécutez: mvn exec:java -Dexec.mainClass="com.example.grpc.Client"
Suivez les instructions à l'écran pour envoyer et recevoir des messages.
Sockets - Service de chat
Lancer le serveur de chat

Naviguez dans le répertoire Sockets/
Compilez: javac ChatServer.java
Exécutez: java ChatServer
Connecter les clients

Ouvrez plusieurs terminaux, compilez javac ChatClient.java et exécutez java ChatClient
Suivez les instructions à l'écran pour envoyer des messages et voir les réponses des autres utilisateurs.
