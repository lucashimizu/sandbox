CREATE TABLE users(
  id UUID NOT NULL,
  name TEXT NOT NULL,
  email TEXT NOT NULL,
  pass TEXT NOT NULL,
  CONSTRAINT users_pkey PRIMARY KEY (id)
);