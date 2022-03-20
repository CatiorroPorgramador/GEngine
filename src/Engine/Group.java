package src.Engine;

import java.util.ArrayList;

public class Group
{
    public ArrayList<Entity> list;

    // Constructor
    public Group()
    {
        list = new ArrayList<Entity>();
    }

    // Methods
    public boolean get_collision_groups(Group a)
    {
        for (int i=0; i < list.size(); i++)
        {
            for (int i2=0; i2 < a.list.size(); i2++)
            {
                if (this.list.get(i).is_colliding(a.list.get(i2).rect))
                {
                    return true;
                }
            }
        }
        return false;
    }
}
