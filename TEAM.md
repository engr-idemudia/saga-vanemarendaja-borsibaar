# Team

**Team name:** Saga Team

## Members

- Idemudia Osaghae — @engr-idemudia

## Workflow

- `main` is protected (no direct pushes)
- Each feature is developed in a separate branch
- Changes are merged via GitHub Pull Requests
- At least one review before merging
- Conflicts are resolved locally using Git CLI

## Merge strategies used

Demonstrate multiple GitHub merge strategies during development:

### Squash merge

Used for the `feature/add-sample-env` pull request.
This change was small and self-contained, so squashing helped keep the main
branch history clean.

### Merge commit

Used for the `feature/backend-dto-validation` pull request.
This feature consisted of multiple meaningful commits, so preserving commit
history improved traceability.

### Rebase merge

Used for documentation updates.
This keeps a linear history for simple changes and avoids unnecessary merge
commits.

No major merge conflicts were encountered yet.
