package src.Engine;

import java.util.ArrayList;

@SuppressWarnings("serial")
public class Group extends ArrayList<Entity>
{
    // Constructor
    public Group()
    {
        
    }

    // Methods
    public boolean get_collision_groups(Group a)
    {
        for (int i=0; i < this.size(); i++)
        {
            for (int i2=0; i2 < a.size(); i2++)
            {
                if (this.get(i).is_colliding(a.get(i2).rect))
                {
                    return true;
                }
            }
        }
        return false;
    }
}
