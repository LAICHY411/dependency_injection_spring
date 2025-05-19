L'Injection des Dépendances (DI) est un patron de conception où les dépendances sont "injectées" dans une classe plutôt que créées à l'intérieur de celle-ci. Cela améliore la modularité et la testabilité.

Creation des packages:

![image](https://github.com/user-attachments/assets/d616d98b-abf8-4eb9-ba33-5bfea5d21853)

Creation de l'interface IDao avec une implementation du version based de donnees:

IDao :

![image](https://github.com/user-attachments/assets/25b6023e-d6e5-4d68-b9a6-c8798c7ae99f)

ImpDao version 1 :

![image](https://github.com/user-attachments/assets/bf0f5c76-5eec-4c12-9427-10d1f320e0e7)

Creation de l'interface ImpMetier avec une implementation de l'interface:

Interface ImpMetier :

![image](https://github.com/user-attachments/assets/3eae3a64-bbea-401e-ac1c-7dd70340f610)

Implementation de l'interface ImpMetier :

![image](https://github.com/user-attachments/assets/1981cafd-0dba-4481-a3ec-33f244f43a59)

L'injection des dependances via le constructeur et le setter utilisant l'instanciation statique :

![image](https://github.com/user-attachments/assets/068a39fa-2fa4-4a0d-8fc6-4e89c482d7c1)

Creation du package extension pour ajouter une autre implementation de l'interface Idao :

![image](https://github.com/user-attachments/assets/9b4d990f-2453-4b04-b35a-4e46b2676edd)

Creation de la classe presentation 2 pour utiliser l'intanciation dynamique :

![image](https://github.com/user-attachments/assets/a50f5f82-ee46-4e37-9385-34d5e06f3eee)

Le fichier config.txt pour utiliser ave la classe presentation 2 :

![image](https://github.com/user-attachments/assets/48339da8-2679-4f8c-80c3-0490be19af2b)

Creation de la classe presentation qui utilise le fichier xml du spring pour faire l'injection des dependances :

![image](https://github.com/user-attachments/assets/9f26531e-fca1-4721-bc02-786dddf7be66)

Le fichier de configuration XML :

![image](https://github.com/user-attachments/assets/03bd212d-b45f-4649-8d4d-813f8c2680e9)

Utilisation des annotation pour appliquer le concept de l'injection des dependances :

![image](https://github.com/user-attachments/assets/29844072-2929-44c0-ae81-fe277e5873cd)











