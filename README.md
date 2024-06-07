README - Systèmes de Communication Distribuée en Java

**Description du Projet : Implémentation de Serveurs et Clients en Java avec Java RMI, gRPC et Sockets**

Ce projet vise à explorer les technologies de communication distribuée en Java en implémentant des serveurs et des clients utilisant Java RMI, gRPC, et les sockets. L'objectif principal est de comprendre le fonctionnement de chaque technologie et de comparer leurs performances, leur facilité de mise en œuvre et leur flexibilité.

**Objectifs du Projet :**
- Implémenter des serveurs et des clients avec Java RMI, gRPC et les sockets.
- Acquérir une compréhension approfondie des concepts fondamentaux de la communication distribuée.
- Comparer les différentes approches en termes de facilité de mise en œuvre, de performances et de flexibilité.
- Analyser les avantages et les limitations de chaque technologie dans des scénarios d'utilisation réelle.

**Spécifications des Services à Implémenter :**

*Java RMI* : Gestion d'une liste de tâches
- Ajouter une nouvelle tâche à la liste.
- Supprimer une tâche existante de la liste.
- Récupérer la liste complète des tâches.

*gRPC* : Service de messagerie
- Envoi de messages texte à un destinataire spécifié.
- Récupération des messages reçus pour un utilisateur donné.

*Sockets* : Service de chat
- Envoi de messages texte à un salon de discussion commun.
- Récupération des messages envoyés par d'autres utilisateurs.

**Livraisons Attendues :**
- Implémentation fonctionnelle des serveurs et des clients pour chaque technologie de communication.
- Documentation détaillée des étapes de mise en œuvre, des choix de conception et des performances observées.
- Comparaison des technologies basée sur des critères prédéfinis tels que la facilité de mise en œuvre, la performance et la flexibilité.
- Analyse des avantages et des limitations de chaque technologie dans les scénarios d'utilisation réelle.


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
