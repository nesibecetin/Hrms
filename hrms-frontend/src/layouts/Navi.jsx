import React from "react";
import { Button,Container, Dropdown, Menu } from "semantic-ui-react";

export default function Navi() {
  return (
    <div>
      <Menu size="small" fixed="top">
      <Container>
        <Menu.Item name="iş ilanları" />
        <Menu.Item name="adaylar" />
        <Menu.Menu position="right">      
          <Menu.Item>
            <Button primary>Giriş Yap</Button>
            <Button primary>Kayıt Ol</Button>
          </Menu.Item>
        </Menu.Menu>
        </Container>
      </Menu>     
    </div>
  );
}
