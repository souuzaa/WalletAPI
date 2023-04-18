CREATE TABLE IF NOT EXISTS wallet
(
  id    VARCHAR(60) DEFAULT RANDOM_UUID() PRIMARY KEY,
  name  VARCHAR NOT NULL
);

CREATE TABLE IF NOT EXISTS wallet_item
(
  id VARCHAR(60) DEFAULT RANDOM_UUID() PRIMARY KEY,
  wallet_id VARCHAR(60) NOT NULL,
  stock  VARCHAR NOT NULL,
  foreign key (wallet_id) references wallet(id)
);