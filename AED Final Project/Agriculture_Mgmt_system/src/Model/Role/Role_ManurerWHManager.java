
package Model.Role;
import Model.EcoSys;
import Model.Enterprise.*;
import Model.Organization.*;
import Model.Yield.YieldDir;
import Model.YieldReview.YieldReviewDir;
import Model.PrimaryItem.PrimaryItemsDir;
import Model.PrimaryItemReview.PrimaryItemReviewDir;
import Model.UserAccount.UserAccount;
import javax.swing.JPanel;
import UI.ManurerWHRole.ManurerWHJPanel;

/**
 *
 * @author Hitesh
 */
public class Role_ManurerWHManager extends Role {
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSys business,YieldDir produceDirectory, PrimaryItemsDir rmDirectory,YieldReviewDir prDirectory,PrimaryItemReviewDir rmrDirectory) {
        return new ManurerWHJPanel(userProcessContainer,account,(OrgProducerWH)organization,enterprise,business,rmDirectory);
       
    }   
    
}
