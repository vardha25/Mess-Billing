package Accounts;

import Accounts.StudentsPK;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-17T13:10:22")
@StaticMetamodel(Students.class)
public class Students_ { 

    public static volatile SingularAttribute<Students, StudentsPK> studentsPK;
    public static volatile SingularAttribute<Students, String> name;
    public static volatile SingularAttribute<Students, String> emailId;
    public static volatile SingularAttribute<Students, BigInteger> contactNo;

}