# Progmod II. elso beadando

Fegyencek alapvető adatainak tárolása és lekérése
- ID (Integer)
- Név (String)
- Nem (GenderENUM)

Elmentett fegyencek `db.csv`-ből kiolvasva, hozáadott fegyencek mentése nincs implementálva.

`http://localhost:8080/inmates`

> GET: Fegyencek listájának lekérése (JSON Formátumban)

> POST: Fegyence hozzáadása (JSON Formátumban) Példa:
`{
        "id": 4,
        "name": "Teszt Negy;",
        "gender": "FEMALE"
}`
