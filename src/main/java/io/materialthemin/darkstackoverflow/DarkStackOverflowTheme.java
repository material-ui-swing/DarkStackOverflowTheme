package io.materialthemin.darkstackoverflow;

import io.materialthemin.darkstackoverflow.utils.ThemeColor;
import jiconfont.icons.google_material_design_icons.GoogleMaterialDesignIcons;
import mdlaf.themes.AbstractMaterialTheme;
import mdlaf.utils.MaterialBorders;
import mdlaf.utils.MaterialColors;
import mdlaf.utils.MaterialFontFactory;
import mdlaf.utils.MaterialImageFactory;

import javax.swing.*;
import javax.swing.plaf.BorderUIResource;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.FontUIResource;
import java.awt.*;

/**
 * You can extends also another theme, like MaterialLiteTheme
 */
public class DarkStackOverflowTheme extends AbstractMaterialTheme {

    @Override
    public void installTheme() {
        installColor();
        installFonts();
        installBorders();
        installIcons();
    }

    @Override
    protected void installFonts(){
        super.fontBold = new FontUIResource(Font.SANS_SERIF, Font.BOLD,14);
        super.fontItalic = new FontUIResource(Font.SANS_SERIF, Font.ITALIC,14);
        super.fontMedium = new FontUIResource(Font.SANS_SERIF, Font.PLAIN,14);
        super.fontRegular = new FontUIResource(Font.SANS_SERIF, Font.PLAIN,14);
    }

    @Override
    protected void installIcons() {
        this.selectedCheckBoxIcon = MaterialImageFactory.getInstance().getImage(
                GoogleMaterialDesignIcons.CHECK_BOX,
                highlightBackgroundPrimary
        );
        this.unselectedCheckBoxIcon = MaterialImageFactory.getInstance().getImage(
                GoogleMaterialDesignIcons.CHECK_BOX_OUTLINE_BLANK,
                MaterialColors.WHITE
        );

        this.selectedRadioButtonIcon = MaterialImageFactory.getInstance().getImage(MaterialImageFactory.RADIO_BUTTON_WHITE_ON);
        this.unselectedRadioButtonIcon = MaterialImageFactory.getInstance().getImage(MaterialImageFactory.RADIO_BUTTON_WHITE_OFF);

        this.selectedCheckBoxIconTable = MaterialImageFactory.getInstance().getImage(
                GoogleMaterialDesignIcons.CHECK_BOX,
                highlightBackgroundPrimary
        );
        this.unselectedCheckBoxIconTable = MaterialImageFactory.getInstance().getImage(
                GoogleMaterialDesignIcons.CHECK_BOX_OUTLINE_BLANK,
                highlightBackgroundPrimary
        );
        this.selectedCheckBoxIconSelectionRowTable = MaterialImageFactory.getInstance().getImage(
                GoogleMaterialDesignIcons.CHECK_BOX,
                MaterialColors.BLACK
        );
        this.unselectedCheckBoxIconSelectionRowTable = MaterialImageFactory.getInstance().getImage(
                GoogleMaterialDesignIcons.CHECK_BOX_OUTLINE_BLANK,
                MaterialColors.BLACK
        );

        this.closedIconTree = MaterialImageFactory.getInstance().getImage(
                GoogleMaterialDesignIcons.KEYBOARD_ARROW_RIGHT,
                MaterialColors.WHITE
        );

        this.openIconTree = MaterialImageFactory.getInstance().getImage(
                GoogleMaterialDesignIcons.KEYBOARD_ARROW_DOWN,
                highlightBackgroundPrimary
        );

        //this.yesCollapsedTaskPane = MaterialImageFactory.getInstance().getImage(MaterialImageFactory.YES_COLLAPSED);
        this.noCollapsedTaskPane = MaterialImageFactory.getInstance().getImage(
                GoogleMaterialDesignIcons.KEYBOARD_ARROW_RIGHT
        );

        //this.noCollapsedTaskPane = MaterialImageFactory.getInstance().getImage(MaterialImageFactory.NO_COLLAPSED);
        this.yesCollapsedTaskPane = MaterialImageFactory.getInstance().getImage(
                GoogleMaterialDesignIcons.KEYBOARD_ARROW_DOWN
        );


        this.warningIconOptionPane = MaterialImageFactory.getInstance().getImage(MaterialImageFactory.WARNING);
        this.errorIconIconOptionPane =  MaterialImageFactory.getInstance().getImage(MaterialImageFactory.ERROR);
        this.questionIconOptionPane = MaterialImageFactory.getInstance().getImage(MaterialImageFactory.QUESTION);
        this.informationIconOptionPane = MaterialImageFactory.getInstance().getImage(MaterialImageFactory.INFORMATION);

        this.iconComputerFileChooser = MaterialImageFactory.getInstance().getImage(MaterialImageFactory.COMPUTER_WHITE);
        this.iconDirectoryFileChooser = MaterialImageFactory.getInstance().getImage(MaterialImageFactory.FOLDER_WHITE);
        this.iconFileFileChooser = MaterialImageFactory.getInstance().getImage(MaterialImageFactory.FILE_WHITE);
        this.iconFloppyDriveFileChooser = MaterialImageFactory.getInstance().getImage(MaterialImageFactory.FLOPPY_DRIVE_WHITE);
        this.iconHardDriveFileChooser = MaterialImageFactory.getInstance().getImage(MaterialImageFactory.HARD_DRIVE_WHITE);
        this.iconHomeFileChooser = MaterialImageFactory.getInstance().getImage(MaterialImageFactory.HOME_WHITE);
        this.iconListFileChooser = MaterialImageFactory.getInstance().getImage(MaterialImageFactory.LIST_WHITE);
        this.iconDetailsFileChooser = MaterialImageFactory.getInstance().getImage(MaterialImageFactory.DETAILS_WHITE);
        this.iconNewFolderFileChooser = MaterialImageFactory.getInstance().getImage(MaterialImageFactory.NEW_FOLDER_WHITE);
        this.iconUpFolderFileChooser = MaterialImageFactory.getInstance().getImage(MaterialImageFactory.BACK_ARROW_WHITE);

        this.unselectedIconToggleButton = MaterialImageFactory.getInstance().getImage(MaterialImageFactory.TOGGLE_BUTTON_OFF_WHITE);
        this.selectedIconToggleButton = MaterialImageFactory.getInstance().getImage(MaterialImageFactory.TOGGLE_BUTTON_ON_WHITE);

        super.iconCloseTitlePane = MaterialImageFactory.getInstance().getImage(MaterialImageFactory.CLOSE_WINDOWS_WHITE);

        super.leafIconTree = MaterialImageFactory.getInstance().getImage(
                MaterialImageFactory.BLANK
        );
    }

    @Override
    protected void installBorders() {
        super.installBorders();
        borderMenuBar = new BorderUIResource(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(225, 156, 43)));
        borderPopupMenu = new BorderUIResource(BorderFactory.createLineBorder(backgroundPrimary));
        borderSpinner = new BorderUIResource(BorderFactory.createLineBorder(backgroundTextField));
        borderSlider = new BorderUIResource(BorderFactory.createCompoundBorder(borderSpinner, BorderFactory.createEmptyBorder(15, 15, 15, 15)));
        cellBorderTableHeader = new BorderUIResource(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(backgroundTableHeader),
                BorderFactory.createEmptyBorder(5,10,5,10)));
        borderToolBar = borderSpinner;

        borderDialogRootPane = MaterialBorders.DEFAULT_SHADOW_BORDER;

        borderProgressBar = borderSpinner;

        this.borderComboBox = MaterialBorders.roundedLineColorBorder(MaterialColors.WHITE, 12);
        this.borderTable = borderSpinner;
        this.borderTableHeader = borderSpinner;

        super.borderTitledBorder = new BorderUIResource(BorderFactory.createLineBorder(MaterialColors.WHITE));

        super.titleColorTaskPane = MaterialColors.BLACK;
    }

    @Override
    protected void installColor() {
        this.backgroundPrimary = ThemeColor.GlobalColor.getBackgroundPrimary();
        this.textColor = ThemeColor.GlobalColor.getTextColorEnable();

        this.highlightBackgroundPrimary = ThemeColor.GlobalColor.getHighlightBackground();

        this.disableTextColor = new ColorUIResource(170, 170, 170);

        this.buttonBackgroundColor = ThemeColor.ButtonColors.getBackgroundButton();
        this.buttonBackgroundColorMouseHover = ThemeColor.ButtonColors.getMouseHoverBackgroundButton();
        this.buttonTextColor = textColor;
        this.buttonDefaultBackgroundColorMouseHover = ThemeColor.ButtonColors.getMouseHoverBackgroundButton();
        this.buttonDefaultBackgroundColor = ThemeColor.ButtonColors.getBackgroundButton();
        this.buttonDefaultTextColor = textColor;
        this.buttonDisabledBackground = new ColorUIResource(66,69,76);
        this.buttonDisabledForeground = MaterialColors.GRAY_500;
        this.buttonFocusColor = MaterialColors.WHITE;
        this.buttonDefaultFocusColor = MaterialColors.WHITE;
        /**
         * The following propriety don't is used inside the theme in this cases but is a good line not have null
         * object inside the theme
         */
        this.buttonBorderColor = buttonBackgroundColor;
        this.buttonColorHighlight = ThemeColor.ButtonColors.getMouseHoverBackgroundButton();

        this.selectedInDropDownBackgroundComboBox = new ColorUIResource(249, 192, 98);
        this.selectedForegroundComboBox = MaterialColors.BLACK;

        this.menuBackground = backgroundPrimary;
        this.menuBackgroundMouseHover = buttonBackgroundColorMouseHover;
        this.menuTextColor = MaterialColors.WHITE;
        this.menuDisableBackground = MaterialColors.TRANSPANENT;

        this.arrowButtonColorScrollBar = buttonBackgroundColor;
        this.trackColorScrollBar = new ColorUIResource(81, 86, 101);
        this.thumbColorScrollBar = new ColorUIResource(155,155,155);
        this.thumbDarkShadowColorScrollBar = thumbColorScrollBar;
        this.thumbHighlightColorScrollBar = thumbColorScrollBar;
        this.thumbShadowColorScrollBar = thumbColorScrollBar;
        this.arrowButtonOnClickColorScrollBar = buttonBackgroundColorMouseHover;
        this.mouseHoverColorScrollBar = thumbColorScrollBar;

        this.trackColorSlider = new ColorUIResource(119, 119, 119);
        this.haloColorSlider = MaterialColors.bleach(new Color(249, 192, 98), 0.2f);

        this.highlightColorTabbedPane = backgroundPrimary;
        this.borderHighlightColorTabbedPane = backgroundPrimary;
        this.focusColorLineTabbedPane = ThemeColor.GlobalColor.getHighlightBackgroundMiddle();
        this.disableColorTabTabbedPane = new ColorUIResource(170,170,170);

        this.backgroundTable = new ColorUIResource(45,48,56);
        this.backgroundTableHeader = new ColorUIResource(66,179,176);
        this.foregroundTable = textColor;
        this.foregroundTableHeader = textColor;
        this.selectionBackgroundTable = new ColorUIResource(126, 132, 153);
        this.selectionForegroundTable = textColor;
        this.gridColorTable = new ColorUIResource(151,151,151);
        this.alternateRowBackgroundTable = new ColorUIResource(59, 62, 69);

        this.dockingBackgroundToolBar = MaterialColors.LIGHT_GREEN_A100;
        this.floatingBackgroundToolBar = MaterialColors.GRAY_200;

        this.selectionBackgroundTree = super.backgroundPrimary;
        this.selectionBorderColorTree = super.backgroundPrimary;

        this.backgroundTextField = new ColorUIResource(81, 86, 101);
        this.inactiveForegroundTextField = MaterialColors.WHITE;
        this.inactiveBackgroundTextField = new ColorUIResource(81, 86, 101);
        this.selectionBackgroundTextField = new ColorUIResource(249, 192, 98);
        super.disabledBackgroudnTextField = new ColorUIResource(81, 86, 101);
        super.disabledForegroundTextField = new ColorUIResource(170,170,170);
        this.selectionForegroundTextField = MaterialColors.BLACK;
        this.inactiveColorLineTextField = MaterialColors.WHITE;
        this.activeColorLineTextField = new ColorUIResource(249, 192, 98);

        this.arrowButtonBackgroundSpinner = backgroundTextField;
        this.mouseHoverButtonColorSpinner = backgroundPrimary;

        this.titleBackgroundGradientStartTaskPane = MaterialColors.GRAY_300;
        this.titleBackgroundGradientEndTaskPane = MaterialColors.GRAY_500;
        this.titleOverTaskPane = new ColorUIResource(249, 192, 98);
        this.specialTitleOverTaskPane = MaterialColors.WHITE;
        this.backgroundTaskPane = backgroundPrimary;
        this.borderColorTaskPane = backgroundTaskPane;
        this.contentBackgroundTaskPane = backgroundPrimary;

        this.selectionBackgroundList = ThemeColor.GlobalColor.getHighlightBackgroundUnder();
        this.selectionForegroundList = MaterialColors.BLACK;

        this.backgroundProgressBar = ThemeColor.GlobalColor.getHighlightBackgroundUnder();
        this.foregroundProgressBar = ThemeColor.GlobalColor.getHighlightBackgroundMiddle();


        this.withoutIconSelectedBackgroundToggleButton = highlightBackgroundPrimary;
        this.withoutIconSelectedForegoundToggleButton = MaterialColors.BLACK;
        this.withoutIconBackgroundToggleButton = backgroundPrimary;
        this.withoutIconForegroundToggleButton = MaterialColors.WHITE;

        this.colorDividierSplitPane = MaterialColors.COSMO_DARK_GRAY;
        this.colorDividierFocusSplitPane = new ColorUIResource(249, 192, 98);

        super.colorTextTitledBorder = textColor;

        super.backgroundSeparator = MaterialColors.GRAY_300;
        super.foregroundSeparator = MaterialColors.GRAY_300;
    }

    @Override
    public void installUIDefault(UIDefaults table) {
        super.installUIDefault(table);
    }

    @Override
    public String getName() {
        return "Example theme";
    }

    /**
     * Default value, override the method
     */
    @Override
    public boolean getButtonBorderEnable() {
        return false;
    }
}
