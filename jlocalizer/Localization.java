// JLocalizer by Violent Studio.

package jlocalizer;

/**
 * Localization class.
 */
public class Localization {
    protected LocalizationPack locPack;

    protected String defaultLanguage = null;

    /**
     * Initialize localization manager.
     */
    public Localization(LocalizationPack locPack_) {
        locPack = locPack_;
    }

    /**
     * Set language by default.
     */
    public void setDefaultLanguage(String defaultLanguage_) {
        defaultLanguage = defaultLanguage_;
    }

    /**
     * Get default language.
     */
    public String getDefaultLanguage() {
        return defaultLanguage;
    }

    /**
     * Get localized string.
     */
    public String getString(String name, String language) {
        return locPack.getMap().get(String.format("%s_%s", name, language));
    }

    /**
     * Get localized string.
     */
    public String getString(String name) {
        if(defaultLanguage != null) {
            return getString(name, defaultLanguage);
        }

        return null;
    }
}
