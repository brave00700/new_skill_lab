# PWA-6 — GitHub Fetch Demo

Small demo showing how to fetch GitHub data from the browser.

## What this project contains

- `index.html` — Main page. Displays sample stock data and includes a small UI to fetch GitHub API data.
- `github-fetch.js` — Helper functions:
  - `fetchGitHub(endpoint, token)` — Generic GitHub REST call.
  - `fetchRepoContent(owner, repo, path, token)` — Convenience wrapper to read repository content.
- `data.json`, `manifest.json`, `sw.js`, `icon/` — existing project files.

## Quick start

Serve the folder and open the page in a browser (recommended to use a local static server so fetches and service worker work correctly):

```bash
# from project root
python3 -m http.server 8000
# then open http://localhost:8000/
```

Enter a GitHub `owner` and `repo` in the "Fetch GitHub data" form, optionally provide a `path` (like `README.md`) and a personal access token for private repos. Click "Fetch" to see the API response.

## Security notes

- Do NOT paste long-lived personal access tokens into pages hosted on public or untrusted environments. If you need to access private data in production, implement a server-side proxy that stores secrets securely.
- Browser-side calls are fine for public data and quick demos.

## Examples

- Read a public repo README: owner=`octocat`, repo=`Hello-World`, path=`README.md` (no token required).
- To list root contents, leave `path` empty.

## Next steps / Improvements

- Add a small server proxy to keep tokens secret (Express or serverless function).
- Add UI improvements and caching for offline use via the service worker.

---
