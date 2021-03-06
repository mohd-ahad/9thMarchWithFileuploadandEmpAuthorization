//package emp.portal.controller;
//
//
//
//import emp.portal.entity.DatabaseFile;
//import emp.portal.service.DatabaseFileService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.core.io.ByteArrayResource;
//import org.springframework.core.io.Resource;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.servlet.http.HttpServletRequest;
//import java.io.FileNotFoundException;
//
//
//@RestController
//    public class downloadcontroller {
//
//        @Autowired
//        private DatabaseFileService fileStorageService;
//
//        @GetMapping("/downloadFile/{fileid:.+}")
//        public ResponseEntity<Resource> downloadFile(@PathVariable int fileid, HttpServletRequest request) throws FileNotFoundException {
//            // Load file as Resource
//            DatabaseFile databaseFile = fileStorageService.getFile(fileid);
//
//            return ResponseEntity.ok()
//                    .contentType(MediaType.parseMediaType(databaseFile.getFileType()))
//                    .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + databaseFile.getFileName() + "\"")
//                    .body(new ByteArrayResource(databaseFile.getData()));
//        }
//    }
