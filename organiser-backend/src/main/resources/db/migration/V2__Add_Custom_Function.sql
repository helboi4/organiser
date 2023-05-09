CREATE OR REPLACE FUNCTION insert_reminder_and_return_id(
    user_id BIGINT,
    evet_id BIGINT,
    method VARCHAR(255),
    minutes INTEGER
)
RETURNS BIGINT AS $$
DECLARE
    new_id BIGINT;
BEGIN
    INSERT INTO reminders (user_id, event_id, method, minutes)
    VALUES (user_id, evet_id, method, minutes)
    RETURNING id INTO new_id;

    RETURN new_id;
END;
$$ LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION insert_attendee_and_return_id(
    user_id BIGINT,
    evet_id BIGINT,
    displayName VARCHAR(255),
    email VARCHAR(255),
    optional BOOLEAN,
    organizer BOOLEAN,
    self BOOLEAN,
    comment TEXT,
    additionalGuests INTEGER
)
RETURNS BIGINT AS $$
DECLARE
    new_id BIGINT;
BEGIN
    INSERT INTO attendees (user_id, event_id, display_name, email, optional, organizer, self, comment, additional_guests)
    VALUES (user_id, evet_id, displayName, email, optional, organizer, self, comment, additionalGuests)
    RETURNING id INTO new_id;

    RETURN new_id;
END;
$$ LANGUAGE plpgsql;