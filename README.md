# testappgate

## 📘 Contexto

Esta aplicación implementa una solución al problema de contar cuántas subsecuencias distintas de una cadena `source` (como `"rabbbit"`) pueden formar una cadena `target` (como `"rabbit"`).

Este tipo de lógica puede ser útil en:

- Motores de búsqueda o coincidencia de patrones.

---

## 🧱 Arquitectura de Capas

La aplicación está organizada siguiendo una estructura de capas simple y clara:

```text
┌────────────────────────┐
│        Main App        ││
└────────────┬───────────┘
             │
             ▼
┌────────────────────────┐
│     Business Logic     │
│      numDistinct       │
└────────────┬───────────┘
             │
             ▼
┌────────────────────────┐
│        Tests (JUnit)   │
│       numDistinctTest  │
└────────────────────────┘

