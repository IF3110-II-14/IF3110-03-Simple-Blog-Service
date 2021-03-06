
package org.chamerling.heroku.service;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "HelloServiceImpl", targetNamespace = "http://service.heroku.chamerling.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface HelloServiceImpl {


    /**
     * 
     * @param date
     * @param title
     * @param authorid
     * @param content
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addPost", targetNamespace = "http://service.heroku.chamerling.org/", className = "org.chamerling.heroku.service.AddPost")
    @ResponseWrapper(localName = "addPostResponse", targetNamespace = "http://service.heroku.chamerling.org/", className = "org.chamerling.heroku.service.AddPostResponse")
    public boolean addPost(
        @WebParam(name = "title", targetNamespace = "")
        String title,
        @WebParam(name = "content", targetNamespace = "")
        String content,
        @WebParam(name = "date", targetNamespace = "")
        String date,
        @WebParam(name = "authorid", targetNamespace = "")
        String authorid);

    /**
     * 
     * @param role
     * @param nama
     * @param id
     * @param email
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "editUser", targetNamespace = "http://service.heroku.chamerling.org/", className = "org.chamerling.heroku.service.EditUser")
    @ResponseWrapper(localName = "editUserResponse", targetNamespace = "http://service.heroku.chamerling.org/", className = "org.chamerling.heroku.service.EditUserResponse")
    public boolean editUser(
        @WebParam(name = "id", targetNamespace = "")
        String id,
        @WebParam(name = "nama", targetNamespace = "")
        String nama,
        @WebParam(name = "role", targetNamespace = "")
        String role,
        @WebParam(name = "email", targetNamespace = "")
        String email);

    /**
     * 
     * @return
     *     returns java.util.List<org.chamerling.heroku.service.Post>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listPost", targetNamespace = "http://service.heroku.chamerling.org/", className = "org.chamerling.heroku.service.ListPost")
    @ResponseWrapper(localName = "listPostResponse", targetNamespace = "http://service.heroku.chamerling.org/", className = "org.chamerling.heroku.service.ListPostResponse")
    public List<Post> listPost();

    /**
     * 
     * @param postid
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deletePost", targetNamespace = "http://service.heroku.chamerling.org/", className = "org.chamerling.heroku.service.DeletePost")
    @ResponseWrapper(localName = "deletePostResponse", targetNamespace = "http://service.heroku.chamerling.org/", className = "org.chamerling.heroku.service.DeletePostResponse")
    public boolean deletePost(
        @WebParam(name = "postid", targetNamespace = "")
        String postid);

    /**
     * 
     * @param role
     * @param nama
     * @param email
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addUser", targetNamespace = "http://service.heroku.chamerling.org/", className = "org.chamerling.heroku.service.AddUser")
    @ResponseWrapper(localName = "addUserResponse", targetNamespace = "http://service.heroku.chamerling.org/", className = "org.chamerling.heroku.service.AddUserResponse")
    public boolean addUser(
        @WebParam(name = "nama", targetNamespace = "")
        String nama,
        @WebParam(name = "email", targetNamespace = "")
        String email,
        @WebParam(name = "role", targetNamespace = "")
        String role);

    /**
     * 
     * @param commid
     * @param postid
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteComment", targetNamespace = "http://service.heroku.chamerling.org/", className = "org.chamerling.heroku.service.DeleteComment")
    @ResponseWrapper(localName = "deleteCommentResponse", targetNamespace = "http://service.heroku.chamerling.org/", className = "org.chamerling.heroku.service.DeleteCommentResponse")
    public boolean deleteComment(
        @WebParam(name = "postid", targetNamespace = "")
        String postid,
        @WebParam(name = "commid", targetNamespace = "")
        String commid);

    /**
     * 
     * @param id
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteUser", targetNamespace = "http://service.heroku.chamerling.org/", className = "org.chamerling.heroku.service.DeleteUser")
    @ResponseWrapper(localName = "deleteUserResponse", targetNamespace = "http://service.heroku.chamerling.org/", className = "org.chamerling.heroku.service.DeleteUserResponse")
    public boolean deleteUser(
        @WebParam(name = "id", targetNamespace = "")
        String id);

    /**
     * 
     * @param postid
     * @return
     *     returns java.util.List<java.lang.Object>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listComment", targetNamespace = "http://service.heroku.chamerling.org/", className = "org.chamerling.heroku.service.ListComment")
    @ResponseWrapper(localName = "listCommentResponse", targetNamespace = "http://service.heroku.chamerling.org/", className = "org.chamerling.heroku.service.ListCommentResponse")
    public List<Object> listComment(
        @WebParam(name = "postid", targetNamespace = "")
        String postid);

    /**
     * 
     * @param nama
     * @param konten
     * @param postid
     * @param tanggal
     * @param email
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addComment", targetNamespace = "http://service.heroku.chamerling.org/", className = "org.chamerling.heroku.service.AddComment")
    @ResponseWrapper(localName = "addCommentResponse", targetNamespace = "http://service.heroku.chamerling.org/", className = "org.chamerling.heroku.service.AddCommentResponse")
    public boolean addComment(
        @WebParam(name = "postid", targetNamespace = "")
        String postid,
        @WebParam(name = "nama", targetNamespace = "")
        String nama,
        @WebParam(name = "email", targetNamespace = "")
        String email,
        @WebParam(name = "konten", targetNamespace = "")
        String konten,
        @WebParam(name = "tanggal", targetNamespace = "")
        String tanggal);

    /**
     * 
     * @return
     *     returns java.util.List<org.chamerling.heroku.service.User>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listUser", targetNamespace = "http://service.heroku.chamerling.org/", className = "org.chamerling.heroku.service.ListUser")
    @ResponseWrapper(localName = "listUserResponse", targetNamespace = "http://service.heroku.chamerling.org/", className = "org.chamerling.heroku.service.ListUserResponse")
    public List<User> listUser();

    /**
     * 
     * @param query
     * @return
     *     returns java.util.List<java.lang.Object>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "search", targetNamespace = "http://service.heroku.chamerling.org/", className = "org.chamerling.heroku.service.Search")
    @ResponseWrapper(localName = "searchResponse", targetNamespace = "http://service.heroku.chamerling.org/", className = "org.chamerling.heroku.service.SearchResponse")
    public List<Object> search(
        @WebParam(name = "query", targetNamespace = "")
        String query);

    /**
     * 
     * @param konten
     * @param postid
     * @param tanggal
     * @param judul
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "editPost", targetNamespace = "http://service.heroku.chamerling.org/", className = "org.chamerling.heroku.service.EditPost")
    @ResponseWrapper(localName = "editPostResponse", targetNamespace = "http://service.heroku.chamerling.org/", className = "org.chamerling.heroku.service.EditPostResponse")
    public boolean editPost(
        @WebParam(name = "postid", targetNamespace = "")
        String postid,
        @WebParam(name = "judul", targetNamespace = "")
        String judul,
        @WebParam(name = "konten", targetNamespace = "")
        String konten,
        @WebParam(name = "tanggal", targetNamespace = "")
        String tanggal);

    /**
     * 
     * @param id
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "publishPost", targetNamespace = "http://service.heroku.chamerling.org/", className = "org.chamerling.heroku.service.PublishPost")
    @ResponseWrapper(localName = "publishPostResponse", targetNamespace = "http://service.heroku.chamerling.org/", className = "org.chamerling.heroku.service.PublishPostResponse")
    public boolean publishPost(
        @WebParam(name = "id", targetNamespace = "")
        String id);

}
