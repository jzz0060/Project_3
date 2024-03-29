
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainUI {
    public JFrame view;

    public JButton btnManageCustomer = new JButton("Manage Customers");
    public JButton btnManageProduct = new JButton("Manage Products");
    public JButton btnManagePurchase = new JButton("Manage Purchase");

    public MainUI() {
        this.view = new JFrame();

        view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        view.setTitle("Store Management System");
        view.setSize(1000, 600);
        view.getContentPane().setLayout(new BoxLayout(view.getContentPane(), BoxLayout.PAGE_AXIS));

        JLabel title = new JLabel("Store Management System");

        title.setFont (title.getFont ().deriveFont (24.0f));
        view.getContentPane().add(title);

        JPanel panelButtons = new JPanel(new FlowLayout());
        panelButtons.add(btnManageProduct);
        panelButtons.add(btnManageCustomer);
        panelButtons.add(btnManagePurchase);

        view.getContentPane().add(panelButtons);


        btnManagePurchase.addActionListener(
                new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        ManagePurchaseUI ap = new ManagePurchaseUI();
                        ap.run();
                    }
                });

        btnManageProduct.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        ManageProductUI ui = new ManageProductUI();
                        ui.run();
                    }
                });

        btnManageCustomer.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        ManageCustomerUI ui = new ManageCustomerUI();
                        ui.run();
                    }
                });

    }
}
