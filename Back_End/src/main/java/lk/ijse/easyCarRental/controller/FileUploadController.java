package lk.ijse.easyCarRental.controller;

import lk.ijse.easyCarRental.dto.imgDTO;
import lk.ijse.easyCarRental.util.ResponseUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

@RestController
@RequestMapping("/upload")
@CrossOrigin
public class FileUploadController {

    //Formalized end-point to upload files using Spring
    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil uploadFileWithSpringWay(@RequestPart("nic") MultipartFile nic, @RequestPart("licence") MultipartFile licence,@RequestPart("lossDamageWaiver") MultipartFile lossDamage, @RequestPart("frontImage") MultipartFile frontImage, @RequestPart("backImage") MultipartFile backImage,@RequestPart("rightImage") MultipartFile rightImage,@RequestPart("leftImage") MultipartFile leftImage) {
        try {
            String projectPath = new File(this.getClass().getProtectionDomain().getCodeSource().getLocation().toURI()).getParentFile().getParentFile().getAbsolutePath();
            File uploadsDir = new File(projectPath + "/uploads");
            System.out.println(projectPath);
            uploadsDir.mkdir();
            nic.transferTo(new File(uploadsDir.getAbsolutePath() + "/" + nic.getOriginalFilename()));
            licence.transferTo(new File(uploadsDir.getAbsolutePath() + "/" + licence.getOriginalFilename()));
            lossDamage.transferTo(new File(uploadsDir.getAbsolutePath() + "/" + lossDamage.getOriginalFilename()));
            frontImage.transferTo(new File(uploadsDir.getAbsolutePath() + "/" + frontImage.getOriginalFilename()));
            backImage.transferTo(new File(uploadsDir.getAbsolutePath() + "/" + backImage.getOriginalFilename()));
            rightImage.transferTo(new File(uploadsDir.getAbsolutePath() + "/" + rightImage.getOriginalFilename()));
            leftImage.transferTo(new File(uploadsDir.getAbsolutePath() + "/" + leftImage.getOriginalFilename()));

            //Save the path of the uploaded images in dto
            imgDTO imgDTO = new imgDTO();

            imgDTO.setNicImgPath("uploads/" + nic.getOriginalFilename());
            imgDTO.setLicenceImgPath("uploads/" + licence.getOriginalFilename());
            imgDTO.setLossDamageImgPath("uploads/" + lossDamage.getOriginalFilename());
            imgDTO.setFrontImgPath("uploads/" + frontImage.getOriginalFilename());
            imgDTO.setBackImgPath("uploads/" + backImage.getOriginalFilename());
            imgDTO.setRightImgPath("uploads/" + rightImage.getOriginalFilename());
            imgDTO.setLeftImgPath("uploads/" + leftImage.getOriginalFilename());

            return new ResponseUtil("200", "success" + imgDTO, imgDTO);
        } catch (URISyntaxException e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        }
    }

//    @PostMapping(path = "/m1" ,consumes = MediaType.MULTIPART_FORM_DATA_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseUtil uploadFileWithSpringWay(@RequestPart("lossDamage") MultipartFile lossDamage) {
//        try {
//            String projectPath = new File(this.getClass().getProtectionDomain().getCodeSource().getLocation().toURI()).getParentFile().getParentFile().getAbsolutePath();
//            File uploadsDir = new File(projectPath + "/uploads");
//            System.out.println(projectPath);
//            uploadsDir.mkdir();
//            lossDamage.transferTo(new File(uploadsDir.getAbsolutePath() + "/" + lossDamage.getOriginalFilename()));
//            lossDamage.transferTo(new File(uploadsDir.getAbsolutePath() + "/" + lossDamage.getOriginalFilename()));
//
//            //Save the path of the uploaded images in dto
//            imgDTO imgDTO = new imgDTO();
//
//            imgDTO.setLossDamageImgPath("uploads/" + lossDamage.getOriginalFilename());
//
//            return new ResponseUtil("200", "success" + imgDTO, imgDTO);
//        } catch (URISyntaxException e) {
//            e.printStackTrace();
//            throw new RuntimeException(e.getMessage());
//        } catch (IOException e) {
//            e.printStackTrace();
//            throw new RuntimeException(e.getMessage());
//        }
//    }
}
