CREATE TABLE users(
id BIGSERIAL PRIMARY KEY,
username VARCHAR(255) NOT NULL,
email VARCHAR(255) NOT NULL,
password VARCHAR(255) NOT NULL
);

CREATE TABLE goals (
id BIGSERIAL PRIMARY KEY,
user_id BIGINT REFERENCES users(id) NOT NULL,
category VARCHAR(255),
title VARCHAR(255) NOT NULL,
Description TEXT,
date_set TIMESTAMP,
deadline TIMESTAMP NOT NULL,
date_completed TIMESTAMP
);

CREATE TABLE projects (
id BIGSERIAL PRIMARY KEY,
user_id BIGINT REFERENCES users(id) NOT NULL,
goal_id BIGINT REFERENCES goals(id),
category VARCHAR(255),
title VARCHAR(255) NOT NULL,
description TEXT,
date_set TIMESTAMP,
deadline TIMESTAMP NOT NULL,
date_completed TIMESTAMP,
difficulty VARCHAR(255),
status VARCHAR(255)
);

CREATE TABLE tasks (
id BIGSERIAL PRIMARY KEY,
user_id BIGINT REFERENCES users(id),
goal_id BIGINT REFERENCES goals(id),
project_id BIGINT REFERENCES tasks(id) NOT NULL,
category VARCHAR(255),
title VARCHAR(255) NOT NULL,
description TEXT,
deadline TIMESTAMP,
date_completed TIMESTAMP,
status VARCHAR(255)
);

CREATE TABLE habits (
id BIGSERIAL PRIMARY KEY,
user_id BIGINT REFERENCES users(id) NOT NULL,
goal_id BIGINT REFERENCES goals(id),
project_id BIGINT REFERENCES projects(id),
category VARCHAR(255),
title VARCHAR(255) NOT NULL,
description TEXT,
date_set TIMESTAMP
);

CREATE TABLE habit_checks (
id BIGSERIAL PRIMARY KEY,
user_id BIGINT REFERENCES users(id) NOT NULL,
habit_id BIGINT REFERENCES habits(id) NOT NULL,
completed BOOLEAN NOT NULL
);

CREATE TABLE attendees(
id BIGSERIAL PRIMARY KEY,
event_id BIGINT REFERENCES events(id) NOT NULL,
user_id BIGINT REFERENCES users(id) NOT NULL,
displayName VARCHAR(255),
email VARCHAR(255) NOT NULL,
optional BOOLEAN,
organizer BOOLEAN,
responseStatus BOOLEAN,
self BOOLEAN,
comment TEXT,
additionalGuests INTEGER
);

CREATE TABLE reminders(
id BIGSERIAL PRIMARY KEY,
user_id BIGINT REFERENCES users(id) NOT NULL,
event_id BIGINT REFERENCES events(id) NOT NULL,
method VARCHAR(255),
minutes INTEGER
);

CREATE TABLE events (
id BIGSERIAL PRIMARY KEY,
user_id BIGINT REFERENCES users(id) NOT NULL,
goal_id BIGINT REFERENCES goals(id),
project_id BIGINT REFERENCES projects(id),
title VARCHAR(255) NOT NULL,
category VARCHAR(255),
start_datetime TIMESTAMP NOT NULL,
end_datetime TIMESTAMP NOT NULL,
description TEXT,
--here we store the foreign keys of the attendees and reminders
reminders INTEGER[],
attendees INTEGER[],
platform VARCHAR(255),
reccurrence VARCHAR(255)[],
link VARCHAR(255),
location VARCHAR(255)
);

CREATE TABLE quickticks (
id BIGSERIAL PRIMARY KEY,
user_id BIGINT REFERENCES users(id) NOT NULL,
goal_id BIGINT REFERENCES goals(id),
category VARCHAR(255),
title VARCHAR(255) NOT NULL
);

