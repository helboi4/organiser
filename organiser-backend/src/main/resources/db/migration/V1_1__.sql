CREATE TABLE users(
id BIGSERIAL PRIMARY KEY,
username VARCHAR(255) NOT NULL,
email VARCHAR(255) NOT NULL,
password VARCHAR(255) NOT NULL
);

CREATE TABLE goals (
id BIGSERIAL PRIMARY KEY,
user_id INTEGER REFERENCES users(id) NOT NULL,
category VARCHAR(255),
title VARCHAR(255) NOT NULL,
Description TEXT,
date_set TIMESTAMP,
deadline TIMESTAMP NOT NULL,
date_completed TIMESTAMP
);

CREATE TABLE projects (
id BIGSERIAL PRIMARY KEY,
user_id INTEGER REFERENCES users(id) NOT NULL,
goal_id INTEGER REFERENCES goals(id),
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
user_id INTEGER REFERENCES users(id),
goal_id INTEGER REFERENCES goals(id),
project_id INTEGER REFERENCES tasks(id) NOT NULL,
category VARCHAR(255),
title VARCHAR(255) NOT NULL,
description TEXT,
deadline TIMESTAMP,
date_completed TIMESTAMP,
status VARCHAR(255)
);

CREATE TABLE habits (
id BIGSERIAL PRIMARY KEY,
user_id INTEGER REFERENCES users(id) NOT NULL,
goal_id INTEGER REFERENCES goals(id),
project_id INTEGER REFERENCES projects(id),
category VARCHAR(255),
title VARCHAR(255) NOT NULL,
description TEXT,
date_set TIMESTAMP
);

CREATE TABLE habit_checks (
id BIGSERIAL PRIMARY KEY,
user_id INTEGER REFERENCES users(id) NOT NULL,
habit_id INTEGER REFERENCES habits(id) NOT NULL,
completed BOOLEAN NOT NULL
)

CREATE TABLE events (
id BIGSERIAL PRIMARY KEY,
user_id INTEGER REFERENCES users(id) NOT NULL,
goal_id INTEGER REFERENCES goals(id),
project_id REFERENCES projects(id),
title VARCHAR(255) NOT NULL,
category VARCHAR(255),
start_datetime TIMESTAMP NOT NULL,
end_datetime TIMESTAMP NOT NULL,
description TEXT,
reminders TIMESTAMP[],
attendees VARCHAR(255)[],
link VARCHAR(255),
location VARCHAR(255)
);

CREATE TABLE quickticks (
id BIGSERIAL PRIMARY KEY,
user_id INTEGER REFERENCES users(id) NOT NULL,
goal_id INTEGER REFERENCES goals(id),
category VARCHAR(255),
title VARCHAR(255) NOT NULL
);

