# organiser
An app to organise my entire life.

The techstack will include:
1. An PostgresQL database (which I will eventually spin up in a Docker container)
2. A Java Spring Boot API (perhaps also in that container or in another?)
3. A React Native frontend (for deployment across Android, iOS and Web without changing much hopefully).

Proposed features:
1. A calendar that pulls in events from both Google and Outlook and can create events that automatically post to Google, Outlook or both as specified
2. Large goals that are broken down into projects which break down into tasks. Some sort of kanban interface.
3. Habits that can also be attached to goals or projects, with a classic habit tracker
4. Graphs to show progress towards goals and projects and habit trends etc.
5. Small "quick ticks" that will have a basic todo ticker interface (like "pay bills")
6. Some reminder notifications

Current status:
- I have initilised a Spring application using SpringInitializer
- I have created migration files for the PostgresQL database.
- I have created some boilerplate for most classes needed for basic API interaction with the database.
- I have attempted to implement logic for posting to Google Calendar (needs a lot of adjusting).
