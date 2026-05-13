CREATE TABLE applications(
    id BIGSERIAL PRIMARY KEY,
    company VARCHAR(255) NOT NULL,
    position VARCHAR(255) NOT NULL,
    status VARCHAR(20) NOT NULL,
    applied_date DATE NOT NULL,
    job_url VARCHAR(500),
    location VARCHAR(100),
    notes TEXT,
    salary_min INTEGER,
    salary_max INTEGER,
    salary_currency VARCHAR(3),
    salary_period VARCHAR(10),
    source VARCHAR(50),
    created_at TIMESTAMPTZ NOT NULL,
    updated_at TIMESTAMPTZ NOT NULL
);
