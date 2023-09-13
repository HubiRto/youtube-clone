## Główne założenia
Prosty projekt który ma na celu owzrorowanie aplikacji YouTube w oparciu na architekturę monolitową z wykorzystaniem bazy danych NoSQL, czyli bazy typu dokumentowego.

Projekt zakłada podzielenia aplikacji na dwa moduły: frontend (<b>Angular</b>) i backend(<b>SpringBoot</b>).

W projekcie chcę się głownie skupić na dobrej logice aplikacji od strony backend'owej tj. REST API, ale będę też starał się wykonać dobrze wyglądający stronę, a co dla najważniejsze intuicyjną dla użytkownika.

Aplikacja zkałada stworzenie tylko podstawowych funkcjonalości/mechanizmów światowego giganta jakim jest YouTube, takich jak: 
- proste lgowanie i wylogowanie przy pomocy jednego przycisku
- możliwość umieszczania nowych filmów na platformie
- możliwość umieszczania własnych miniatur do filmów
- możliwość oglądania filmów innych uzytkowników
- możliwość dodawania własnych opinii w postaci łapek w górę i w dół
- możliwość subskrypcji innego użytkownika po to, aby otrzymywać powiadomieni, gdy ten udostępni nowy film
- możliwość dodawania komentarzy pod filmami 
- historia oglądanych filmów
- historia polubionych filmów


### Technologie 
- Spring Boot
- MongoDB
- Angular
- AWS S3 – do trzymania filmów i miniatur