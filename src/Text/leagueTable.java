package Text;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class leagueTable extends JTable {

    public leagueTable() {

        setShowHorizontalLines(true);
        setRowHeight(30);
        setGridColor(new Color(255, 255, 255));
        getTableHeader().setReorderingAllowed(false);
        getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                TableHeader header = new TableHeader(value + "");
                return header;
            }
        });
        setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                if (column != 8) {
                    Component com = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                    com.setBackground(new Color(131, 145, 146));
                    setBorder(noFocusBorder);
                    if (isSelected) {
                        com.setForeground(new Color(72, 245, 57));
                    } else {
                        com.setForeground(new Color(255, 255, 255));
                    }
                    return com;
                }

                return new JLabel("Testing");

            }
        });

    }

    public void addRow(Object[] row) {
        DefaultTableModel model = (DefaultTableModel) getModel();
        model.addRow(row);

    }

    public void clearRow() {
        DefaultTableModel model = (DefaultTableModel) getModel();
        model.setRowCount(0);
    }

}
