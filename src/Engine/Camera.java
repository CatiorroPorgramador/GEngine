package src.Engine;

import java.util.ArrayList;

public class Camera
{
    Group objects;

    public boolean smooth;

    // Constructor
    public Camera()
    {
        
    }

    // Methods
    public void update(Group objects)
    {
        this.objects = objects;
    }

    public void move(Vector2 vector)
    {
        for (int i=0; i < this.objects.size(); i++)
        {
            Entity current = this.objects.get(i);

            current.rect.x += vector.x;
            current.rect.x += vector.y;
        }
    }

    public void move(Vector2 vector, ArrayList<String> fixed_objects_name)
    {
        for (int i=0; i < this.objects.size(); i++)
        {
            Entity current = this.objects.get(i);

            if (!fixed_objects_name.contains(current.name))
            {
                current.rect.x += vector.x;
                current.rect.x += vector.y;
            }
        }
    }

    public void zoom(Vector2 vector)
    {
        for (int i=0; i < this.objects.size(); i++)
        {
            Entity current = this.objects.get(i);

            current.rect.width += vector.x;
            current.rect.height += vector.y;
        }
    }
}