package io.materialtheme.darkstackoverflow;

import io.materialtheme.darkstackoverflow.utils.ThemeColor;

import mdlaf.themes.AbstractMaterialTheme;
import mdlaf.utils.MaterialBorders;
import mdlaf.utils.MaterialColors;
import mdlaf.utils.MaterialFontFactory;

import javax.swing.*;
import javax.swing.plaf.BorderUIResource;
import javax.swing.plaf.ColorUIResource;
import java.awt.*;

/**
 * You can extends also another theme, like MaterialLiteTheme
 */
public class DarkStackOverflowTheme extends AbstractMaterialTheme {

    @Override
    protected void installFonts() {
        this.fontBold = MaterialFontFactory.getInstance().getFont(MaterialFontFactory.BOLD);
        this.fontItalic = MaterialFontFactory.getInstance().getFont(MaterialFontFactory.ITALIC);
        this.fontMedium = MaterialFontFactory.getInstance().getFont(MaterialFontFactory.MEDIUM);
        this.fontRegular = MaterialFontFactory.getInstance().getFont(MaterialFontFactory.REGULAR);
    }

    @Override
    protected void installBorders() {
        super.installBorders();
        super.borderMenuBar = MaterialBorders.DARK_LINE_BORDER;
        super.borderPopupMenu = MaterialBorders.DARK_LINE_BORDER;
        super.borderComboBox = MaterialBorders.roundedLineColorBorder(MaterialColors.COSMO_DARK_GRAY, this.getArchBorderComboBox());
        super.borderSlider = MaterialBorders.LIGHT_SHADOW_BORDER;
        super.borderProgressBar = new BorderUIResource(BorderFactory.createLineBorder(this.highlightBackgroundPrimary));
        super.borderTableHeader = new BorderUIResource(BorderFactory.createLineBorder(this.backgroundPrimary));
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

        this.menuBackground = ThemeColor.GlobalColor.getBackgroundPrimary();
        this.menuBackgroundMouseHover = new ColorUIResource(71, 71, 71);
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

        this.backgroundTextField = ThemeColor.GlobalColor.getBackgroundPrimary();
        this.inactiveForegroundTextField = ThemeColor.GlobalColor.getTextColorEnable();
        this.inactiveBackgroundTextField = ThemeColor.GlobalColor.getBackgroundPrimary();
        this.selectionBackgroundTextField = MaterialColors.COSMO_STRONG_BLUE;
        super.disabledBackgroudnTextField = new ColorUIResource(81, 86, 101);
        super.disabledForegroundTextField = new ColorUIResource(170,170,170);
        this.selectionForegroundTextField = super.inactiveForegroundTextField;
        this.inactiveColorLineTextField = MaterialColors.COSMO_DARK_GRAY;
        this.activeColorLineTextField = MaterialColors.COSMO_STRONG_BLUE;

        this.arrowButtonBackgroundSpinner = backgroundTextField;
        this.mouseHoverButtonColorSpinner = backgroundPrimary;

        this.titleBackgroundGradientStartTaskPane = MaterialColors.GRAY_300;
        this.titleBackgroundGradientEndTaskPane = MaterialColors.GRAY_500;
        this.titleOverTaskPane = new ColorUIResource(249, 192, 98);
        this.specialTitleOverTaskPane = MaterialColors.WHITE;
        this.backgroundTaskPane = backgroundPrimary;
        this.borderColorTaskPane = backgroundTaskPane;
        this.contentBackgroundTaskPane = backgroundPrimary;

        this.selectionBackgroundList = MaterialColors.bleach(this.highlightBackgroundPrimary, 0.2f);
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

        super.backgroundToolTip = ThemeColor.GlobalColor.getBackgroundPrimary();

        super.backgroundTable = this.backgroundPrimary;
        super.foregroundTable = MaterialColors.BLACK;
        super.alternateRowBackgroundTable = null; //disable zebra effect in JTable
        super.selectionBackgroundTable = MaterialColors.bleach(this.highlightBackgroundPrimary, 0.2f);
        super.backgroundTableHeader = this.backgroundTable;

    }

    @Override
    protected void installDefaultColor() {
        super.installDefaultColor();

        super.selectionForegroundTable = MaterialColors.BLACK;
    }

    @Override
    public void installUIDefault(UIDefaults table) {
        super.installUIDefault(table);
        UIManager.put("ComboBox.focusColor", ThemeColor.ButtonColors.getMouseHoverBackgroundButton());
    }

    @Override
    public String getName() {
        return "StackOverflow Dark";
    }

    /**
     * Default value, override the method
     */
    @Override
    public boolean getButtonBorderEnable() {
        return false;
    }

    @Override
    public int getArchBorderComboBox() {
        return 0;
    }

    @Override
    public int getArcButton() {
        return 0;
    }
}
