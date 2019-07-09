package model.am.views;

import model.shared.extensions.ExtEntityImpl;
import model.shared.extensions.ExtViewRowImpl;

import oracle.jbo.domain.BlobDomain;
import oracle.jbo.domain.Number;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Jul 09 11:43:17 AST 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class FilesVORowImpl extends ExtViewRowImpl {
    public static final int ENTITY_FILESEO = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        Id,
        Name,
        UploadedFile;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        protected int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        protected static final int firstIndex() {
            return firstIndex;
        }

        protected static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        protected static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }
    public static final int ID = AttributesEnum.Id.index();
    public static final int NAME = AttributesEnum.Name.index();
    public static final int UPLOADEDFILE = AttributesEnum.UploadedFile.index();

    /**
     * This is the default constructor (do not remove).
     */
    public FilesVORowImpl() {
    }

    /**
     * Gets FilesEO entity object.
     * @return the FilesEO
     */
    public ExtEntityImpl getFilesEO() {
        return (ExtEntityImpl) getEntity(ENTITY_FILESEO);
    }

    /**
     * Gets the attribute value for ID using the alias name Id.
     * @return the ID
     */
    public Number getId() {
        return (Number) getAttributeInternal(ID);
    }

    /**
     * Sets <code>value</code> as attribute value for ID using the alias name Id.
     * @param value value to set the ID
     */
    public void setId(Number value) {
        setAttributeInternal(ID, value);
    }

    /**
     * Gets the attribute value for NAME using the alias name Name.
     * @return the NAME
     */
    public String getName() {
        return (String) getAttributeInternal(NAME);
    }

    /**
     * Sets <code>value</code> as attribute value for NAME using the alias name Name.
     * @param value value to set the NAME
     */
    public void setName(String value) {
        setAttributeInternal(NAME, value);
    }

    /**
     * Gets the attribute value for UPLOADED_FILE using the alias name UploadedFile.
     * @return the UPLOADED_FILE
     */
    public BlobDomain getUploadedFile() {
        return (BlobDomain) getAttributeInternal(UPLOADEDFILE);
    }

    /**
     * Sets <code>value</code> as attribute value for UPLOADED_FILE using the alias name UploadedFile.
     * @param value value to set the UPLOADED_FILE
     */
    public void setUploadedFile(BlobDomain value) {
        setAttributeInternal(UPLOADEDFILE, value);
    }
}
