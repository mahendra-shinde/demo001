# Security Policy

## Supported Versions

Security updates are provided for the following versions:

| Version | Supported |
| ------- | --------- |
| 2.x     | ✅ |
| 1.x     | ✅ |
| < 1.0   | ❌ |

## Reporting a Vulnerability

If you discover a security issue, please report it privately:

- Email: **security@your-project.org**
- Include: affected version, reproduction steps, impact, and any proof-of-concept details.

Do **not** open a public issue for security vulnerabilities.

## Response Process

1. We will acknowledge receipt within **3 business days**.
2. We will investigate and validate the report.
3. We will provide status updates as fixes are developed.
4. A patch and security advisory will be released once remediation is ready.

## Secure Development Guidelines (Java)

- Keep dependencies up to date (use tools like Dependabot or OWASP Dependency-Check).
- Validate all untrusted input and use parameterized queries.
- Avoid hardcoding secrets; use environment variables or a secrets manager.
- Use the latest supported JDK and enable security updates promptly.
- Apply least-privilege principles for services and runtime accounts.

## Disclosure Policy

Please allow time for investigation and patching before public disclosure. Coordinated disclosure helps protect users.
