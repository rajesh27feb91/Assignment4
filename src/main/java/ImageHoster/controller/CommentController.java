package ImageHoster.controller;

import ImageHoster.model.Comment;
import ImageHoster.model.Image;
import ImageHoster.service.CommentService;
import ImageHoster.service.ImageService;
import ImageHoster.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class CommentController {

    @Autowired
    private ImageService imageService;

    @Autowired
    private TagService tagService;

    @Autowired
    private CommentService commentService;

    // THis function fetch all the comments posted for a single Image
    List<Comment> findComments(Image image) {
        return commentService.findComment(image);
    }

}
