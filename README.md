<h1 align="center">jlocalizer</h1>
Minimalistic localization support for Java by Violent Studio.<br><br>Parsing localization pack:

```java
Localization localization = new Localization(new LocalizationPack("localization.lpk")); // Initialize Localization with pack.

localization.setDefaultLanguage("EN"); // Optional to set default language, but you will have to specify language in getString [getString(NAME, LANGUAGE)]

if(localization.isLoaded()) { // It's optional to have that check, but just in case.
    System.out.println(localization.getString("TITLE_0")); // Returns TITLE_IN_EN_0. Returns (null) if name or language not found in pack.
}
```

`localization.lpk`:
```
EN:TITLE_0:TITLE_IN_EN_0
RU:TITLE_0:TITLE_IN_RU_0
UA:TITLE_0:TITLE_IN_UA_0
```

Syntax: `LANGUAGE`:`NAME`:`STRING`.

<hr><p align="center">JLocalizer v1.0.0</p>
