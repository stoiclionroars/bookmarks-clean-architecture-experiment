CREATE TABLE IF NOT EXISTS folder (
    id UUID PRIMARY KEY,
    name VARCHAR(50) UNIQUE NOT NULL,
    description VARCHAR(255) NOT NULL,
    workspace_id UUID,
    CONSTRAINT fk_constraint
        FOREIGN KEY(workspace_id)
            REFERENCES workspace(id)
);